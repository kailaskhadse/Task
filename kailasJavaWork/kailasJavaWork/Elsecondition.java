package kailasJavaWork;
import java.util.Scanner;
public class Elsecondition {

	public static void main(String[] args) {
	
		System.out.println("Enter any num ");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt() ;
		if(a>0) {
			System.out.println("Positive num");
		}
		else if(a<0) {
			System.out.println("Negative num");}
			else if(a==0)
			{
				System.out.println("number is zero");
			}
			
		}
	}


