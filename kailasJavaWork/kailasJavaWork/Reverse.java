package kailasJavaWork;

import java.util.Scanner;

public class Reverse
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any name:");
	String s=sc.next();
	String r="";
	int a=s.length()-1;
	
	for(int i=a;i>=0;i--)
	{
		r=r+s.charAt(i);
	}	
		System.out.println(r);
		
	
		/*if(f==1)
		{
			System.out.println("prime num");
		}
	else {System.out.println("Not prime num");*/
		
	}
	
}

