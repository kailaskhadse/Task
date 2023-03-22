package jdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {
	Scanner sc = new Scanner(System.in);

	public void addTable() throws Exception {
		Connection cn = Configuration1.buildConnection();
		String sql = "create table persondetails(pid int,pname varchar(20),contact int)";
		Statement smt = cn.createStatement();
		smt.execute(sql);
		smt.close();
		cn.close();
	}

	public void insertData() throws Exception {
		Connection cn = Configuration1.buildConnection();
		Statement smt = cn.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of person be added");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			PersonDetails p = new PersonDetails();
			System.out.println("Enter person id ");
			int pid = sc.nextInt();
			p.setPid(pid);
			System.out.println("Enter person name :");
			String pname = sc.next();
			p.setPname(pname);
			System.out.println("Enter person contact");
			int contact = sc.nextInt();
			p.setContact(contact);
			String sql1 = "insert into persondetails values(" + p.getPid() + ",'" + p.getPname() + "'," + p.getContact()
					+ ")";
		
		// System.out.println(sql1);
		
		smt.execute(sql1);
		}
		
		//smt.close();
		cn.close();
		System.out.println("insert value successfullydone");
	}

	

	public void viewData() throws Exception {
		Connection cn = Configuration1.buildConnection();
		String sql2 = "Select * from persondetails";
		PreparedStatement prs = cn.prepareStatement(sql2);
		ResultSet rs = prs.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("pid");
			String name = rs.getString("pname");
			int contact = rs.getInt("contact");
			System.out.println("pname:" + name + " " + "pid :" + id + " " + "contact :" + contact);

		} 
	}
	public void deletData()throws Exception{
		Connection cn=Configuration1.buildConnection();
		System.out.println("enter choise :\n 1.pname \n 2.pid \n 3.contact");
	int choise=sc.nextInt();
	if(choise==1) {
		System.out.println("enter name which data delete");
		String name=sc.next();
	String sql3="delete from persondetails where pname='"+name+"'";
	Statement sm=cn.createStatement();
	sm.execute(sql3);
	}
	else if(choise==2) {
		System.out.println("enter id which data delete");
		int id=sc.nextInt();
	String sql4="delete from persondetails where pid=+id";
	Statement sm=cn.createStatement();
	sm.execute(sql4);
	}
	else if(choise==3) {
		System.out.println("enter contact which data delete");
		int contact=sc.nextInt();
	String sql5="delete from persondetails where contact= +contact";
	Statement sm=cn.createStatement();
	sm.execute(sql5);
	}
	}

	}
		

