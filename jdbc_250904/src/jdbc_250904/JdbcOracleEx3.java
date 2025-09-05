package jdbc_250904;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleEx3 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 완료");

			stmt = conn.createStatement();
//			stmt.executeUpdate("insert into student3 values('4445555', '아무개', '건축학과')");
//			stmt.executeUpdate("update student3 set dept='철학과' where name='아무개'");
			stmt.executeUpdate("delete from student3 where name='아무개'");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
