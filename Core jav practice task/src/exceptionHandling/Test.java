package exceptionHandling;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test t= new Test();
		try {
			String s[] =new String[3];
			s[sc.nextInt()]="1";
			int x=sc.nextInt();
			int y=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter the index valu up to define");
			
		}
		catch(NumberFormatException n) {
			System.out.println("Enter integr value");
			
		}
		catch(ArithmeticException a) {
			System.out.println("not divide by zero ");
		}
			
	
	
		
	
			

	}

}
