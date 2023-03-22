package jdbc_connecton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonTable {
     
	public static void main(String[] args) throws Exception {
		PreparedStatement ps=null;
		ResultSet rs=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root");
		//String sql1="Create table Person4(pid int,pname varchar(20),city varchar(20))";
        String sql2="insert into person4 values(4,'aabc','pune'),(4,'jlmn','washim'),(5,'ptxyz','risod')";
        Statement smt=cn.createStatement();
        //smt.execute(sql1);
        smt.execute(sql2);
        String sql3="Select * from person4";
        ps=cn.prepareStatement(sql3);
        rs=ps.executeQuery();
        while(rs.next()) {
        	int pid=rs.getInt("pid");
        	String name=rs.getString("pname");
        	String city=rs.getString("city");
        	System.out.println("pid :"+pid +" "+"pname :"+name +" "+"city :"+city );
        }
	}

}
