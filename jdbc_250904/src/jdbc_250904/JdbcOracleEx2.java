package jdbc_250904;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleEx2 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
//			오라클 드라이버 로드(오라클 설치파일에서 가져옴)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 완료");
//			SQL문 처리용 Statement 객체 생성
			stmt = conn.createStatement();
//			테이블의 모든 데이터 검색
			ResultSet rs = stmt.executeQuery("select * from student3");
//			printData(rs);
			printData(rs, "id", "name", "dept");

//			데이터 갯수가 있는 만큼 반복
//			while (rs.next()) {
//				System.out.println(rs.getString("id"));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("dept"));
//			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

	private static void printData(ResultSet rs, String col1, String col2, String col3) throws SQLException {
//	private static void printData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			if (!col1.equals("")) {
				System.out.print(rs.getString("id"));
			}
			if (!col2.equals("")) {
				System.out.print("\t|\t" + rs.getString("name"));
			}
			if (!col3.equals("")) {
				System.out.println("\t|\t" + rs.getString("dept"));
			}
		}
	}
}
