package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataTable {

	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
	Scanner sc=new Scanner(System.in);
	Statement smt=cn.createStatement();
	/*String sql="create table Worker(workerId int,workerName varchar(20),city varchar(20), salary float)";
	smt.execute(sql);
	System.out.println("create table done");
	while(true) {
	System.out.println("enter worker id:");
	int wid=sc.nextInt();
	System.out.println("enter worker name");
	String wname=sc.next();
	System.out.println("eneter worker city");
	String city=sc.next();
	System.out.println("enter worker salary");
	float salary =sc.nextFloat();
	//String sql=String.format("insert into worker values(%d,'%s','%s',%f)",wid,wname,city,salary);
	String sql="insert into worker values(?,?,?,?)";
	PreparedStatement pst=cn.prepareStatement(sql);
	pst.setInt(1, wid);
	pst.setString(2, wname);
	pst.setString(3,city);
	pst.setFloat(4, salary);
	pst.execute();
	System.out.println("insert data successfully");
	System.out.println(" do you want to insert one more data(yes/no)");
	String option=sc.next();
	if(option.equalsIgnoreCase("no")) {
		break;
	}*/
String sql="select *from worker";
 ResultSet rs= smt.executeQuery(sql);
 while(rs.next()) {
	 
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
	}
	}
}
