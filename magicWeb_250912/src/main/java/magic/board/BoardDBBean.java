package magic.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();
	
	public static BoardDBBean getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		return ((DataSource) (new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	}
	
		
	public int insertBoard(BoardBean board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int number;
		int id = board.getB_id();
		int ref = board.getB_ref();
		int step = board.getB_step();
		int level = board.getB_level();
		
		int re = -1; // insert 정상적으로 실행되면 1
//		글번호 최대값+1을 구함 : null 일 때는 1, 아니면 +1
		String selectIdSql = "select max(b_id) from boardT";
//							  select max(b_id) from boardT;
//							  select nvl(max(b_id), 0)+1 from boardT;
		String insertSql = "insert into boardT(b_id, b_name, b_email, b_title, b_content, b_date, b_pwd, b_ip, b_ref, b_step, b_level"
				              + ", b_fname, b_rfname, b_fsize)"
							   + " values((select max(b_id)+1 from boardt),?,?,?,?,?,?,?,?,?,?,?,?,?)";
//		String insertSql = "insert into boardT(b_id, b_name, b_email, b_title, b_content)
//							+ " values((select max(b_id)_1 from boardT),?,?,?,?)";
//							+ " values((select nvl(max(b_id), 0)+1 from boardT),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(selectIdSql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				number = rs.getInt(1)+1;
			} else {
				number = 1;
			}
			
			//1. 글번호를 가지고 오는 경우(답변)
//			2. 글번호를 가지고 오지 않는 경우(신규글)
			if(id!=0) { // 글 번호를 가지고 오는 경우(답변)
//				특정 조건에 step_1로 업데이트
				String updateSql = "update boardT set b_step=b_step + 1 where b_ref=? and b_step > ?";
				pstmt = conn.prepareStatement(updateSql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, step);
				re = pstmt.executeUpdate();
				
				step = step + 1;
				level = level + 1;
			}else {	//글번호를 가지고 오지 않는 경우(신규글)
				ref = number;
				step = 0;
				level = 0;
			}
			
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1, board.getB_name());
			pstmt.setString(2, board.getB_email());
			pstmt.setString(3, board.getB_title());
			pstmt.setString(4, board.getB_content());
			pstmt.setTimestamp(5, board.getB_date());
			pstmt.setString(6, board.getB_pwd());
			pstmt.setString(7, board.getB_ip());
			pstmt.setInt(8, ref);
			pstmt.setInt(9, step);
			pstmt.setInt(10, level);
			pstmt.setString(11, board.getB_fname());
			pstmt.setString(12, board.getB_rfname());
			pstmt.setInt(13, board.getB_fsize());
//			insert 문은 executeUpdate 메소드 호출
			re = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
//	public ArrayList<BoardBean> listBoard(){
	public ArrayList<BoardBean> listBoard(String pageNumber){
		Connection conn = null;
		Statement stmt = null;
//		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//페이지에 관련된 결과값 받기 위한 참조변수
		ResultSet pageSet = null;
		//게시글 총 개수
		int dbCount = 0;
		int absolutePage = 1;
		
		String selectSql = "select b_id, b_name, b_email, b_title, b_content"
						 + ", to_char(b_date, 'YYYY-MM-DD HH24:MI'), b_hit, b_pwd, b_ip"
						 + ", b_ref, b_step, b_level"
						 + ", b_fname, b_fsize from boardT "
						 + "order by b_ref desc, b_step asc";
		String sql2 = "select count(b_id) from boardT";
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		
		try {
			conn = getConnection();
//			stmt = conn.createStatement();
			//페이지 처리를 위한 메소드 파라미터 추가 (Oracle 방식)
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			rs = stmt.executeQuery(selectSql);
			pageSet = stmt.executeQuery(sql2);
			
			if(pageSet.next()) { 	//게시글 총 개수 존재 여부
				dbCount = pageSet.getInt(1); 	//게시글 총 개수
				pageSet.close();	//자원 반납
			}
			
			//84건 경우 (84 % 10 = 4)
			//80건 경우 (80 % 10 = 0)
			if (dbCount % BoardBean.pageSize == 0) {
//				80/10 = 8페이지
				BoardBean.pageCount = dbCount / BoardBean.pageSize;
			} else {
//				84/10+1 = 9페이지
				BoardBean.pageCount = dbCount / BoardBean.pageSize + 1;
			}
			
			if (pageNumber != null) { //넘겨오는 페이지 번호가 있는 경우
				BoardBean.pageNum = Integer.parseInt(pageNumber);
				//1: 0*10+1=1, 2:1*10+1=11 (1페이지는 1, 2페이지는 11(페이지 기준 게시글))
				absolutePage = (BoardBean.pageNum - 1) * BoardBean.pageSize + 1;
			}
			
			rs = stmt.executeQuery(selectSql);
			
			if(rs.next()) {
				rs.absolute(absolutePage);	//페이지의 기준 게시글 셋팅
				int count = 0;
				
				while(count < BoardBean.pageSize) {	//게시글 개수만큼 반복
					BoardBean board = new BoardBean();
					
					board.setB_id(rs.getInt(1));
					board.setB_name(rs.getString(2));
					board.setB_email(rs.getString(3));
					board.setB_title(rs.getString(4));
					board.setB_content(rs.getString(5));
					board.setB_date2(rs.getString(6));
					board.setB_hit(rs.getInt(7));
					board.setB_pwd(rs.getString(8));
					board.setB_ip(rs.getString(9));
					board.setB_ref(rs.getInt(10));
					board.setB_step(rs.getInt(11));
					board.setB_level(rs.getInt(12));
//					여기까지가 1행을 가져와서 저장
					
//					행의 데이터를 ArrayList 에 저장
					boardList.add(board);
					
					//페이지 변경시 처리 위한 로직
					if (rs.isLast()) {
						break;
					}else {
						rs.next();
					}
					count++;
				}
			}

			
			/*
			while(rs.next()) {
				list = new BoardBean();
				list.setB_id(rs.getInt("b_id"));
				list.setB_name(rs.getString("b_name"));
				list.setB_email(rs.getString("b_email"));
				list.setB_title(rs.getString("b_title"));
				list.setB_content(rs.getString("b_content"));
//				list.setB_date(rs.getTimestamp("b_date"));
				list.setB_date2(rs.getString(6));
				list.setB_hit(rs.getInt("b_hit"));
				list.setB_pwd(rs.getString("b_pwd"));
				list.setB_ip(rs.getString("b_ip"));
				list.setB_ref(rs.getInt("b_ref"));
				list.setB_step(rs.getInt("b_step"));
				list.setB_level(rs.getInt("b_level"));
				boardList.add(list);
			}*/
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return boardList;
	}
	
	public BoardBean getBoard(int bid, boolean isHit) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardBean board = null;
		String sql="";
		
		try {
			conn = getConnection();
			
			if(isHit == true) {
				String updateSql = "update boardT set b_hit = b_hit + 1 where b_id=?";
				pstmt = conn.prepareStatement(updateSql);
				pstmt.setInt(1, bid);
				pstmt.executeUpdate();
			}
			
			sql = "select b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd, b_ip"
					   + ", b_ref, b_step, b_level, b_fname, b_rfname, b_fsize from boardT where b_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				board = new BoardBean();
				
				board.setB_id(rs.getInt(1));
				board.setB_name(rs.getString(2));
				board.setB_email(rs.getString(3));
				board.setB_title(rs.getString(4));
				board.setB_content(rs.getString(5));
				board.setB_date(rs.getTimestamp(6));
				board.setB_hit(rs.getInt(7));
				board.setB_pwd(rs.getString(8));
				board.setB_ip(rs.getString(9));
				board.setB_ref(rs.getInt(10));
				board.setB_step(rs.getInt(11));
				board.setB_level(rs.getInt(12));
				board.setB_fname(rs.getString(13));
				board.setB_rfname(rs.getString(14));
				board.setB_fsize(rs.getInt(15));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return board;
	}
	
	public int deleteBoard(int b_id, String b_pwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re = -1;
		String sql = "select b_pwd from boardT where b_id=?";
		String pwd="";
		
		try {
			conn = getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {	//비밀번호가 있으면 참
				pwd = rs.getString(1);
				if(pwd.equals(b_pwd)) {
					sql = "delete from boardT where b_id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, b_id);
					pstmt.executeUpdate();
					re = 1;
				} else {
					re = 0;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
	public int editBoard(BoardBean board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re = -1; // insert 정상적으로 실행되면 1
//		글번호 최대값+1을 구함 : null 일 때는 1, 아니면 +1
		String selectSql = "select b_pwd from boardT where b_id=?";
		String editSql = "update boardT set b_name=?, b_email=?, b_title=?, b_content=? where b_id=?";
		String pwd="";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(selectSql);
			pstmt.setInt(1, board.getB_id());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {	//비밀번호가 있으면 참
				pwd = rs.getString(1);
				if(pwd.equals(board.getB_pwd())) {
					pstmt = conn.prepareStatement(editSql);
					pstmt.setString(1, board.getB_name());
					pstmt.setString(2, board.getB_email());
					pstmt.setString(3, board.getB_title());
					pstmt.setString(4, board.getB_content());
					pstmt.setInt(5, board.getB_id());
					pstmt.executeUpdate();
					re = 1;
				}else {
					re = 0;
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
	public BoardBean getFileName(int b_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		BoardBean board = null;
		
		try {
			conn = getConnection();
			sql = "select b_fname, b_rfname from boardT where b_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_id);
			rs = pstmt.executeQuery();
			
			//첨부파일이 있으면 
			if(rs.next()) {
				board = new BoardBean();
				
				board.setB_fname(rs.getString(1));
				board.setB_rfname(rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return board;
	}
}
