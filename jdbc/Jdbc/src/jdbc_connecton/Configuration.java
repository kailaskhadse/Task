package jdbc_connecton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Configuration {
	static Connection cn=null;
	public static Connection buildConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory", "root", "root");
		return cn;
		
	}

}
