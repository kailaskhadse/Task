package kailasJavaWork;

import java.util.*;

public class Calculator1 {
	

	int a;
	int b;
	public Calculator1(int a,int b) {
		this.a=a;
		this.b=b;}
		public void add() {
			int c= a+b;
			System.out.println("addition :"+c);
		}
		public void sub() {
			int c= a-b;
			System.out.println("Substraction :"+c);
		}
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the values of a, b");
			int a=sc.nextInt();
			int b=sc.nextInt();
			Calculator1 c=new Calculator1(a, b);
			c.add();
			c.sub();
		}

	}


