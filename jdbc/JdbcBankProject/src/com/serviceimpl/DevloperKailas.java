package com.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Account;
import com.service.Bank;
import com.utility.Configuration;

public class DevloperKailas implements Bank {
	Scanner sc=new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("start....");
		try{
			Connection cn=Configuration.buildConnection();
			while(true) {
		String sql="insert into account values(?,?,?)";
		System.out.println("****welcome to Sbi****");
		Account ac=new Account();
		System.out.println("enter account number");
		ac.setAccnum(sc.nextInt());
		System.out.println("Enter account holder name ");
		ac.setAccHolderName(sc.next());
		System.out.println("Account balance ");
		ac.setAccBalance(sc.nextInt());
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, ac.getAccnum());
		ps.setString(2, ac.getAccHolderName());
		ps.setInt(3, ac.getAccBalance());
		ps.execute();
		System.out.println("Account created successfully");
		System.out.println("do yo want add another account : yes/no");
		String choise=sc.next();
		if(choise.equals("no")) {
			break;
		}
		}	}
		catch(Exception e) {
			System.out.println();
			
		}
	}

	@Override
	public void viewAccount() {
		try {
			Connection cn=Configuration.buildConnection();
			System.out.println("Enter account num");
			int ac=sc.nextInt();
			String sql="Select * from account where accnum="+ac;
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("account num :"+rs.getInt(1)+"||"+"account holder name :"+rs.getString(2)+"||"+"account balance :"+rs.getInt(3)+"||");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void viewBalance() {
		System.out.println("Enter account number");
		int a=sc.nextInt();
	 try {
		Connection cn=Configuration.buildConnection();
		String s="select accontBalance from account where accnum=?";
		PreparedStatement ps=cn.prepareStatement(s);
		ps.setInt(1, a);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Account balance is :"+rs.getInt(1));
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("enter valid acc num");
	}
			
		
		
	 
		
	}

	@Override
	public void depositeBalance() {
		try {
			Connection cn=Configuration.buildConnection();
			System.out.println("Enter account number :");
			int a=sc.nextInt();
			String s="select accontBalance from account where accnum=?";
			PreparedStatement ps=cn.prepareStatement(s);
			ps.setInt(1, a);
			ResultSet rs=ps.executeQuery();
			rs.next();
			int bal=rs.getInt(1);
			System.out.println("Available balance is :"+bal);
			System.out.println("Enter amount you want deposite :");
			int depamt=sc.nextInt();
			int updatebal=bal+depamt;
			System.out.println("Account balance is :"+ updatebal);
			String sql="update account set accontbalance="+updatebal +" "+"where accnum="+a;
			//System.out.println(sql);
			Statement smt=cn.createStatement();
			smt.execute(sql);
			System.out.println("deposite amount successfully");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void withdrawBalance() {
		try {
			Connection cn=Configuration.buildConnection();
			System.out.println("Enter account number :");
			int a=sc.nextInt();
			String s="select accontBalance from account where accnum=?";
			PreparedStatement ps=cn.prepareStatement(s);
			ps.setInt(1, a);
			ResultSet rs=ps.executeQuery();
			rs.next();
			int bal=rs.getInt(1);
		    System.out.println("Available balance is :"+bal);
			System.out.println("Enter amount you want to withdraw :");
			int withamt=sc.nextInt();
			if(withamt >= bal+1000)
			{
				int updatebal=bal-withamt;
			System.out.println("Account balance is :"+ updatebal);
			
			
				String sql="update account set accontbalance="+updatebal +" "+"where accnum="+a;
			
			//System.out.println(sql);
			Statement smt=cn.createStatement();
			smt.execute(sql);
			System.out.println("Withdraw amount successfully");}
			else {
				System.out.println("not sufficient balance to withdraw");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void deactivateAccount() {
			
		try {
			Connection cn=Configuration.buildConnection();
			System.out.println("Enter account number :");
			int a=sc.nextInt();
			String sql="delete from account where accnum =" + a ;
			Statement st=cn.createStatement();
			st.execute(sql);
			System.out.println("account deactivated successfully....");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


		
	}


