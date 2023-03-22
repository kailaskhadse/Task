package com.bankprjct.client;

import java.util.Scanner;

import com.bankprjct.serviceImpl.AgeInvalidException;
import com.bankprjct.serviceImpl.Sbi;
import com.bankprjct.sevice.Rbi;

public class Test {
	
	

	public static void main(String[] args) {
		Rbi rbi= new Sbi();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter choice :\n 1.Add new Account \n 2.View Account Details \n 3.Check balance \n 4.Deposite money \n 5.withdraw money \n 6.Exit");
			int choice= s.nextInt();
			switch(choice)
			{
			case 1 : try{
				rbi.creatAccount();
				}
			catch(AgeInvalidException e)
			{
				System.out.println("age must be greater or equal 18 for opening account");
			}
			break;
			case 2 : rbi.displayAllDetails();
			break;
			case 3 : rbi.balanceCheck();
			break;
			case 4: rbi.depositeMoney();
			break;
			case 5: rbi.withdranMoney();
			break;
			case 6:System.exit(0);
			
			
			}
			
			
		}
		

	}

}
