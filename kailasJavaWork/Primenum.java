import java.util.Scanner;

public class Primenum {

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number");
	 int a=sc.nextInt();
	 int temp=0;
	 for(int i=2; i<=a;i++)
	 {
      if(i%a==0) {
    	  temp=temp+1;
      }
	}if(temp==0)
	{
		System.out.println("Number is prime");
	}
	else
	{
		System.out.println("number is not prime");
	}
}}
