package coding;

import java.sql.Connection;

import javax.naming.InitialContext;

import org.apache.tomcat.jdbc.pool.DataSource;

public class CodeDBBean {
	private static CodeDBBean instance = new CodeDBBean();
	
	public static CodeDBBean getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		return ((DataSource) (new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	}
}
