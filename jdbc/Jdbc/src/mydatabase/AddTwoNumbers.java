package mydatabase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class AddTwoNumbers {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
	CallableStatement cs=cn.prepareCall("{call addtwonumbers(50,100,?)}");
	//cs.setInt(1, 30);
	//cs.setInt(2, 20);
	cs.registerOutParameter(1,Types.INTEGER);
cs.execute();
int c=cs.getInt(1);
	System.out.println("done");
	System.out.println(c);
	}
}
