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
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re = -1; // insert 정상적으로 실행되면 1
		int index = 0;
//		글번호 최대값+1을 구함 : null 일 때는 1, 아니면 +1
		String selectIdSql = "select b_id from boardT where b_id >= all(select b_id from boardT)";
//							  select max(b_id) from boardT;
//							  select nvl(max(b_id), 0)+1 from boardT;
		String insertSql = "insert into boardT(b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd) values(?,?,?,?,?,?,?,?)";
//		String insertSql = "insert into boardT(b_id, b_name, b_email, b_title, b_content)
//							+ " values((select max(b_id)_1 from boardT),?,?,?,?)";
//							+ " values((select nvl(max(b_id), 0)+1 from boardT),?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(selectIdSql);
			rs = pstmt.executeQuery(selectIdSql);
			if(rs.next()) {
				index = rs.getInt("b_id");
				index++;
			}else {
				index = 1;
			}
			
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setInt(1, index);
			pstmt.setString(2, board.getB_name());
			pstmt.setString(3, board.getB_email());
			pstmt.setString(4, board.getB_title());
			pstmt.setString(5, board.getB_content());
			pstmt.setTimestamp(6, board.getB_date());
			pstmt.setInt(7, board.getB_hit());
			pstmt.setString(8, board.getB_pwd());
//			insert 문은 executeUpdate 메소드 호출
			re = pstmt.executeUpdate();
			System.out.println("@#@# rere:" + re);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
	public ArrayList<BoardBean> listBoard(){
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		BoardBean list = null;
		Connection conn = null;
		Statement stmt = null;
//		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = "select b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd from boardT order by b_id";
//		String selectSql = "select b_id, b_name, b_email, b_title, b_content, to_char(b_date, 'YYYY-MM-DD HH24:MI') from boardT order by b_id";
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
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
				boardList.add(list);
			}
			
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
	
	public BoardBean getBoard(int number, boolean isHit) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardBean list = null;
		try {
			conn = getConnection();
			if(isHit == true) {
				String updateSql = "update boardT set b_hit = b_hit + 1 where b_id=?";
				pstmt = conn.prepareStatement(updateSql);
				pstmt.setInt(1, number);
				pstmt.executeUpdate();
			}
			
			String sql = "select b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd from boardT where b_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				list = new BoardBean();
				list.setB_id(rs.getInt(1));
				list.setB_name(rs.getString(2));
				list.setB_email(rs.getString(3));
				list.setB_title(rs.getString(4));
				list.setB_content(rs.getString(5));
				list.setB_date(rs.getTimestamp(6));
				list.setB_hit(rs.getInt(7));
				list.setB_pwd(rs.getString(8));
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
		return list;
	}
	
	public int deleteBoard(int b_id, String b_pwd) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
	
	public int editBoard(BoardBean board) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re = -1; // insert 정상적으로 실행되면 1
		int index = board.getB_id();
//		글번호 최대값+1을 구함 : null 일 때는 1, 아니면 +1
		String selectSql = "select b_pwd from boardT where b_id="+index;
		String editSql = "update boardT set b_name=?, b_email=?, b_title=?, b_content=? where b_id=?";
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			pstmt = conn.prepareStatement(editSql);
			
			if(rs.next()) {	//비밀번호가 있으면 참
				String b_pwd = rs.getString(1);
				if(board.getB_pwd().equals(b_pwd)) {
					pstmt.setString(1, board.getB_name());
					pstmt.setString(2, board.getB_email());
					pstmt.setString(3, board.getB_title());
					pstmt.setString(4, board.getB_content());
					pstmt.setInt(5, index);
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
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
}
