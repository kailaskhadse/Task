package kailasJavaWork;

import java.util.Scanner;

public class Calculator

{ 
	int a,b;
	public void num()
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
	}
	public void add()
	{
		num();
		int c=a+b;
		System.out.println("Addition" +c);
		
	}

	public void sub()
	{
		num();
		int c=a-b;
		System.out.println("Substraction" +c);
		
	}
}
