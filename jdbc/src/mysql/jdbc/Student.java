package mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Student {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
		} catch(Exception e) {
			
		}

	}

}
