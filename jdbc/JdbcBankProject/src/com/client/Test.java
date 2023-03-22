package com.client;

import java.util.Scanner;

import com.serviceimpl.DevloperKailas;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DevloperKailas d=new DevloperKailas();
		while(true) {
			System.out.println("**** Welcome to SBI *******");
			System.out.println("Enter choise : \n 1.Creat new Account \n 2.view account \n 3.view balance \n 4.deposite balance \n 5.withdraw balance \n 6.delete acc \n 7.Exist");
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1:d.createAccount();
		 break;
		case 2:  d.viewAccount();
		break;
		case 3: d.viewBalance();
		break;
		case 4 :d.depositeBalance();
		break;
		case 5: d.withdrawBalance();
		break;
		case 6: d.deactivateAccount();
		break;
		case 7 :System.out.println("Thanking you for visiting sbi....!!");
			System.exit(0);
		break;

	}
		}}
}
