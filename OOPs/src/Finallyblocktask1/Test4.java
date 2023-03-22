package Finallyblocktask1;

import Inheritance.SuperAndThistask6.Main;

public class Test4 {
	public int m1() {
		int a=20;
	int b=0;
	try{
		System.out.println("try block start");
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(" catch block");
		return 10;
	}
	finally {
		System.out.println("finally block");
		return 200;
	}
	//System.out.println(""); error
	}
	public static void main(String[] args) {
		Test4 t = new Test4();
		System.out.println(t.m1());
		
	}
}