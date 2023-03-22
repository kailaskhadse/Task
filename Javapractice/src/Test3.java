import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// if else nested if else use
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any non zero positive number :");
		int x=sc.nextInt();
		if(x%2!=0)
		{
			System.out.println("Hello");
		
	    }
		else {
			if(0<x && x<=10)
		{
			System.out.println("HI");
		}
		else if ( x>10 && x<=20) {
			System.out.println("veryHello");
		}
		else if(x>20) {
			System.out.println("Bye");
		}



	}

	}
}
