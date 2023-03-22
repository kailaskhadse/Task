package mydatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Student {

	public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		CallableStatement cs=cn.prepareCall("{call updatedata(?,?,?)}");
		cs.setInt(1, 3);
		cs.setString(2, "udhav");
	    cs.setFloat(3,80);
	    cs.execute();
	    System.out.println("done");
		}


	}


