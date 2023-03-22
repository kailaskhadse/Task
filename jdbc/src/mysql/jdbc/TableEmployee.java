package mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableEmployee {

	public static void main(String[] args) {
		try {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root","root");
		//String sql="Create table employee(eid int primary key, ename varchar(20),salary float)";
		String sql1="insert into employee values(1,'kaials',5000),(2,'rahul',6000),(3,'suresh',7000)";
		Statement st=cn.createStatement();
		//st.execute(sql);
		st.execute(sql1);
		st.close();
		cn.close();
		System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
