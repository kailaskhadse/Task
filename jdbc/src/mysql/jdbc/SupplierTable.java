package mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SupplierTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String sql="Create table Supplier( sid int, sname varchar(20),scity varchar(20),contact float unique key)";
			String sql1="insert into supplier values(1,'a','pune',123554),(2,'b','mumbai',36547889),(3,'c','surat',554788)";
			Statement st= cn.createStatement();
			st.execute(sql);
			st.execute(sql1);
			st.close();
			cn.close();
			System.out.println("done");
		}
		catch(Exception e) {
			
		}

	}

}
