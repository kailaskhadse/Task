 package mysql.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root","root");
//			String sql="create database Test";
       String sql="insert into student values(1,'raj')";
			//String sql="create table student(roll int primary key,name varchar(20))";
			Statement smt=cn.createStatement();
			//smt.execute(sql);
			//smt.close();
			
			cn.close();
			System.out.println("done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
