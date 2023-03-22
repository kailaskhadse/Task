package mydatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Insertdata {

	public static void main(String[] args) throws Exception {
		 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
	CallableStatement cs=cn.prepareCall("{call insetdata(?,?,?)}");
	cs.setInt(1, 112);
	cs.setString(2, "udhav");
    cs.setFloat(3,200000);
    cs.execute();
    System.out.println();
	}
	}
}
