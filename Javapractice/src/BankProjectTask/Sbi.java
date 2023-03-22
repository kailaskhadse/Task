package BankProjectTask;

import java.util.Scanner;

public class Sbi {
	int accountNumber;
	String name;
	String city;
	int age;
	long mobilenum;
	float accountBalance;
	float withdraBalance;
	float depositeBalance;
	Scanner sc=new Scanner(System.in);

   public Sbi(int accountNumber, String name, String city, int age, long mobilenum,float accountBalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.city = city;
		this.age = age;
		this.mobilenum = mobilenum;
		this.accountBalance=accountBalance;
			}
   public void accountDetails()
   {  System.out.println("Enter account number");
      int ac=sc.nextInt();
      if(ac==accountNumber) {
	   System.out.println("Account num:"+accountNumber );
	   System.out.println("Account holder name:"+name);
	   System.out.println("Account holder city:"+city);
	   System.out.println("Account holder city:"+age);
	   System.out.println("Account holder mobilenum:"+mobilenum);}
      else {
    	  System.out.println("Invalid account num");
      }
      
   }
   public void checkBalance()
   {
	  System.out.println("Enter account number");
	  int a=sc.nextInt();
	  if(a==accountNumber) {
		  System.out.println("Available balance :"+accountBalance);}
	  else {
		  System.out.println("Invalid account num");
	  }}
	  public void debositeBal()
	  {
		  System.out.println("Enter account number");
		  int a=sc.nextInt();
		  if(a==accountNumber) {
			  System.out.println("Enter amount to add");
			  float depositeBalance =sc.nextFloat();
			  float availableBal=accountBalance+depositeBalance;
			  System.out.println("Current balance :"+availableBal);}
		else {
		  System.out.println("Invalid account num");
			
   }}
	  public void withdrawBal()
	  {
		 /* System.out.println("Enter account number");
		  int a=sc.nextInt();
		  if(a==accountNumber) {*/
			  System.out.println("Enter amount to withdraw");
			 float withdraBalance=sc.nextFloat();
			 if(withdraBalance< accountBalance-500) {
			 float bal=accountBalance-withdraBalance;
			 System.out.println("Balance :"+bal);}
			 else {
				 System.out.println("Entered amount is greater than available balance" + "available balance is rs "+ accountBalance);
			 }
		  } /*else {
			  System.out.println("Invalid account num");
		  
			  
		  }*/
	  }
	   
  
  



