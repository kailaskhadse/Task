package jdbcPractice;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
 static Connection cn=null;
 public static Connection buidConnection()throws Exception{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:/test", "root", "root");
	 return cn;
 }
	public void creatTable()throws Exception{
		Connection cn=Test.buidConnection();
	String sql="create table supplier1(sid int,sname varchar(20),city varchar(20))";
	Statement smt=cn.createStatement();
	smt.execute(sql);
	smt.close();
	cn.close();
	System.out.println("done");
		
	}
	public void addDetails() throws Exception {
		Connection cn=Test.buidConnection();
    System.out.println("enter number of supplier :");
    int nos=sc.nextInt();
		for(int i=1; i<=nos;i++) {
			Supplier s= new Supplier();
			System.out.println("enter supplier id :");
			int sid=sc.nextInt();
			s.setSid(sid);
			System.out.println("enter supplier name");
			String sname=sc.next();
			s.setSname(sname);
			System.out.println("Enter supplier city :");
			String city =sc.next();
			s.setCity(city);
		 String sql2="insert into supplier1 values("+s.getSid()+",'"+s.getSname()+"','"+s.getCity()+"')";
		Statement smt = cn.createStatement();
		smt.execute(sql2);}
		//smt.close();
		cn.close();
		System.out.println("done");
		}
		public void viewDetails()throws Exception
		{
			Connection cn=Test.buidConnection();
			String sql3="select * from supplier1";
			PreparedStatement psm=cn.prepareStatement(sql3);
			ResultSet rs=psm.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("sid");
				String name=rs.getString("sname");
				String city=rs.getString("city");
				System.out.println("sid :"+id +" "+ "sname :"+name+" "+"city :"+city);
			}
			
			
			
		}
		
	
 public static void main(String[] args) throws Exception {
	Test t = new Test();
	//t.creatTable();
	//t.addDetails();
	t.viewDetails();
}
}
