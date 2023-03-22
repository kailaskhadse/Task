package mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PersonTable {

	public static void main(String[] args) {
try {
  Class.forName("com.mysql.cj.jdbc.Driver");
	
   Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root","root");
 
 // String sql="Create table Person(pid int primary key,pname varchar(20), city varchar(20))";
   String sql="Insert into person1 values(1,'kailas','pune'),(2,'rahul','tane'),(3,'yogesh','washim')";
   //String sql="alter table person add contact int";
  /* String sql= "update person set contact=987456623 where pid=1";
   String sql1= "update person set contact=887456620 where pid=2";
   String sql2= "update person set contact=787456624 where pid=3";*/
   Statement st=cn.createStatement();
   st.execute(sql);
  /* st.execute(sql1);
   st.execute(sql2);*/
   st.close();
   cn.close();
   System.out.println("creat table successfully");

	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
