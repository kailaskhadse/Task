package mydatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class EmployeeTable {

	public void createTable()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
		String sql="create table employee(eid int,ename varchar(20),esalary float)";
		Statement smt=cn.createStatement();
		smt.execute(sql);
		System.out.println("done");
	}
	public void insertValues() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
		Scanner sc= new Scanner(System.in);
		while(true)
		{
		System.out.println("enter employee id :");
		
		int eid=sc.nextInt();
		System.out.println("enter employee name :");
		String ename=sc.next();
		System.out.println("enter employee salary");
		float salary=sc.nextFloat();
		String sql=String.format("insert into employee values(%d,'%s',%f)",eid,ename,salary);
		Statement sm=cn.createStatement();
		sm.execute(sql);
		System.out.println("done");
		System.out.println("do you want to insert another data : Yes / No");
		String choise=sc.next();
		if(choise.equals("no")) {
			break;
			
		}
		
		
	}}
	public void viewData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","root");
		Scanner sc= new Scanner(System.in);
		String sql2="Select * from employee where esalary>6000";
		Statement smt=cn.createStatement();
		ResultSet rs=smt.executeQuery(sql2);
		if(rs.next()==false)
		{
			System.out.println("no record found");
		}
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			
		}
		

	}
		
public static void main(String[] args) throws Exception {
	EmployeeTable e= new EmployeeTable();
	//e.createTable();
	//e.insertValues();
	e.viewData();
	
}
}	
