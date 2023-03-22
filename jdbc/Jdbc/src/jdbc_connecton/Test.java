package jdbc_connecton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	Scanner sc=new Scanner(System.in);
	
	public void creatTable() throws Exception {
		Connection cn=Configuration.buildConnection();
		Statement st=cn.createStatement();
		String sql1="Create table Hospital(id int,name varchar(20), contact int)";
		st.execute(sql1);
		st.close();
		cn.close();
		System.out.println("table created");
		
	}
	public void insertData() throws Exception {
		Connection cn=Configuration.buildConnection();
		Statement st=cn.createStatement();
		System.out.println("Enter hospital id :");
		int id=sc.nextInt();
		System.out.println("Enter hospital name :");
		String name=sc.next();
		System.out.println("Enter contact num :");
		int contact=sc.nextInt();
		System.out.println(+id+name+contact);
		String sql="Insert into hospital values("+id+",'"+name+"'," +contact+")";
		System.out.println(sql);
		//String sql="Insert into hospital values(1,'mgm',9878854),(2,'helthcare',9875466),(3,'citycare',8799999)";
		st.execute(sql);
		//st.close();
		//cn.close();
		System.out.println("insert data done");
	}	
	public void viewAllData() throws Exception {
		Connection cn= Configuration.buildConnection();
		String sql2="Select *from Hospital";
		Statement st=cn.createStatement();
		ResultSet rs = st.executeQuery(sql2);
		//PreparedStatement ps=cn.prepareStatement(sql2);
		//ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int con=rs.getInt("contact");
			System.out.println("id :"+id+" "+"name :"+name+" "+"contact :"+con);
		}

		
	}
	public void deleteData() throws Exception {
		Connection cn=Configuration.buildConnection();
		String sql3 ="Delete from Hospital where id=0";
		Statement smt=cn.createStatement();
		smt.execute(sql3);
		System.out.println("done");
	}
	public static void main(String[] args) throws Exception {
		Test t =new Test();
		//t.creatTable();
		//t.insertData();
		//t.deleteData();
		t.viewAllData();
	}
		
	

	
}
