package com.bankprjct.serviceImpl;

import java.util.Scanner;

import com.bankprjct.model.Account;
import com.bankprjct.sevice.Rbi;

public class Sbi implements Rbi {
	Scanner sc = new Scanner(System.in);
	Account ac= new Account();
  public void creatAccount() {
		System.out.println("Enter Account num");
		int x=sc.nextInt();
		System.out.println("Enter Account Holder name");
		String m=sc.next();
		System.out.println("Enter Aadhar Number");
		long z= sc.nextLong();
		System.out.println("Enter the age ");
	    int y=sc.nextInt();
	   
	    if(y<18) {
	    	throw new AgeInvalidException("Age should be greater or equal 18 years");
	    }
	    else
	    	ac.setName(m);
	    ac.setAccountNumber(y);
	    ac.setAdharNumber(y);
	 
	    ac.setAge(y);
	    
		System.out.println("Enter the balance");
		double d=sc.nextDouble();
		ac.setBalance(d);
  }

	public void displayAllDetails() {
		System.out.println("Enter Account number");
		int acc= sc.nextInt();
		if(acc==ac.getAccountNumber()) {
	
		System.out.println(ac.getName());
		System.out.println(ac.getAdharNumber());
		System.out.println(ac.getAge());
		System.out.println(ac.getBalance());}
		else {
			System.out.println("Sorry incorrect account number");
		}
		
		
		
	}
public void balanceCheck() {
	System.out.println("Enter Account number");
	int acc= sc.nextInt();
	if(acc==ac.getAccountNumber()) {
	System.out.println("account balnce"+ac.getBalance());}
	else {
		System.out.println("Sorry incorrect account number");
	}
		
		
	
}
	public void depositeMoney() {
		System.out.println("Enter Account number");
	int acc= sc.nextInt();
	if(acc==ac.getAccountNumber()) {
	System.out.println("Enter amount to deposite");
	double amt=sc.nextDouble();
	double bal= amt+ac.getBalance();
	System.out.println("account balance"+bal);}
	else {
		System.out.println("Sorry incorrect account number");
	}
	
	
}
	public void withdranMoney() {
		
	System.out.println("Enter Account number");
		int acc= sc.nextInt();
		if(acc==ac.getAccountNumber()) {
		System.out.println("Enter amount to withdraw");
		double amt1=sc.nextDouble();
		if(amt1<=ac.getBalance()-1000)
	
			
		{
		double bal1= ac.getBalance()-amt1;
		System.out.println("account balance"+bal1);
		}
		else
		{
			System.out.println("not suffieient balance");
		}}
		else {
			System.out.println("Sorry incorrect account number");
		}
		
	}
	
}



