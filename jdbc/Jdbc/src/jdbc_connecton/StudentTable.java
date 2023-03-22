package jdbc_connecton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentTable {
	public static void main(String[] args) throws Exception{
		PreparedStatement p3=null;
		ResultSet rs=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement smt=con.createStatement();
		//String sql1="Create table student1(roll int,name varchar(20))";
		//String sql2="insert into student1 values (1,'abc'),(2,'pqr'),(3,'xyz')";
		//smt.execute(sql1);
		//smt.execute(sql2);
		String sql3="update student1 set name='yyy' where roll=3";
		smt.execute(sql3);
		String sql4="Select * from student1 where roll=3";
		p3=con.prepareStatement(sql4);
		rs=p3.executeQuery();
		
		while(rs.next()) {
			//int roll=rs.getInt("roll");
			String nm=rs.getString("name");
			System.out.println("name :"+nm);
		}
		
		
	}
	

}
