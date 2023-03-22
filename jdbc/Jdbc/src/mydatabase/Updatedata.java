package mydatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Updatedata {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
	CallableStatement cs=cn.prepareCall("{call update(?,?,?)}");
	cs.setInt(1,147);
	cs.setString(2, "kailas");
	cs.setFloat(3, 4000);
    
    cs.execute();
    System.out.println("done");

	}
}
