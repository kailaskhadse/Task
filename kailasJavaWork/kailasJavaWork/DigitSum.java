package kailasJavaWork;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x,r,sum=0;
		System.out.println("Enter any number");
		 x=sc.nextInt();
		while(x>0)
		{
			r=x%10;
			sum=sum+r;
			x=x/10;
		}
		System.out.println("sum of digit :"+" "+sum);
	}
	

}
