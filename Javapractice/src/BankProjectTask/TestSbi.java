package BankProjectTask;

import java.util.Scanner;

public class TestSbi {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Sbi s=new Sbi(12345,"NITIN","pune",28,9878978,5000); 
	while(true)	{
	System.out.println("Welcome Sbi");
	System.out.println("Enter your choice : \n 1. Account details \n 2.Check Balance \n 3.Deposite Balance \n 4.Withdraw balnce \n 5.Exit");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:s.accountDetails();
	break;
	case 2 : s.checkBalance();
	break;
	case 3 : s.debositeBal();
	break;
	case 4 : s.withdrawBal();
	break;
	case 5 : System.exit(0);
	}
	
	}
	
}

}
