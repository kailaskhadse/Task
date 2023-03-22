package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Department1 {
	static Connection cn=null;
	 public static Connection buidConnection()throws Exception{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:/test", "root", "root");
		 return cn;
	 }

	 public void createTable() throws Exception {
		 Connection cn=Department1.buidConnection();
		 String sql= "create table department1(did int, dname varchar(20),dhead varchar(20))";
		 Statement st =cn.createStatement();
		 st.execute(sql);
		 st.close();
		 cn.close();
		 System.out.println("done");
	 }
	 public void insertValue() throws Exception {
		 Connection cn=Department1.buidConnection();
		 String sql1="insert into department1 values(?,?,?)";
		 PreparedStatement ps=cn.prepareStatement(sql1);
		 ps.setInt(1, 113);
		 ps.setString(2, "it");
		 ps.setString(3, "deshmukh");
		 
		ps.execute();
		 System.out.println("done");
		 
	 }
	 public void viewData()throws Exception{
		 Connection cn=Department1.buidConnection();
		String sql2="select * from department1";
		PreparedStatement ps=cn.prepareStatement(sql2);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println(rs.getString(3));
		}
	 }
	 public void updateData() throws Exception {
		 Scanner sc= new Scanner(System.in);
		 Connection cn=Department1.buidConnection();
		 //while(true)
		 //{
			 System.out.println("enter chiose for update by \n 1.id \n 2.name \n 3.dhead ");
		     int choise=sc.nextInt();
		     switch(choise) {
		     case 1:
		    	 System.out.println("enter update id ");
		    	int id=sc.nextInt();
		    	System.out.println("id which is changed");
		    	int nid=sc.nextInt();
		    	 String sql="update department1 set did="+id+" " + "where did="+nid;
		    	 System.out.println(sql);
		    	 Statement st=cn.createStatement();
		    	 st.execute(sql);
		     //}
		 
		 } 
	 }
	 public static void main(String[] args) throws Exception {
		Department1 d= new Department1();
		//d.createTable();
		//d.insertValue();
		d.viewData();
		d.updateData();
	}
}
