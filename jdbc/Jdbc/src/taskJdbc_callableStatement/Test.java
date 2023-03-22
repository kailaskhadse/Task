package taskJdbc_callableStatement;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {
	Scanner sc= new Scanner(System.in);
	//Test t= new Test();
	public void insertData() throws Exception {
		Connection cn=Configuration.buildConnection();
		viewData();
	
		while(true)
		{
	    CallableStatement cs=cn.prepareCall("{call insertdatas(?,?,?,?)}");
		System.out.println("Enter supplier id :");
		int id=sc.nextInt();
		System.out.println("Enter supplie name :");
		String nm=sc.next();
		System.out.println("Enter supplie city :");
		String city=sc.next();
		System.out.println("Enter supplie contact :");
		int contact=sc.nextInt();
		cs.setInt(1, id);
		cs.setString(2, nm);
		cs.setString(3, city);
		cs.setInt(4, contact);
		cs.execute();
			System.out.println("do you add another data : Yes/No");
		String choise=sc.next();
		if(choise.equals("no")) {
			break;
			
		}}}
		public void updateData() throws Exception {
			Test t= new Test();
			t.viewData();
			Connection cn=Configuration.buildConnection();
			 CallableStatement cs=cn.prepareCall("{call updatesup(?,?)}");
				System.out.println("Enter supplier id :");
				int id=sc.nextInt();
				System.out.println("Enter supplie name :");
				String nm=sc.next();
				cs.setInt(1, id);
				cs.setString(2, nm);
				cs.execute();
				System.out.println("data avaible after update");
				t.viewData();
		}
		public void deleteData() throws Exception {
			Test t= new Test();
			Connection cn=Configuration.buildConnection();
			 CallableStatement cs=cn.prepareCall("{call deletsup(?)}");
				System.out.println("Enter supplier id :");
				int id=sc.nextInt();
				cs.setInt(1, id);
			    cs.execute();
				//Test t =new Test();
				System.out.println("data avaible after delete operation");
		t.viewData();
			
		}
		public void viewData() throws Exception {
			Connection cn=Configuration.buildConnection();
			 CallableStatement cs=cn.prepareCall("{call viewdata()}");
			 cs.execute();
			ResultSet rs=cs.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
						
			
		}
		
	/*public static void main(String[] args) throws Exception {
		Test t =new Test();
		t.insertData();
		//t.viewData();
		//t.updateData();
		//t.deleteData();
	}
*/
		
		
		
		
	} 


