package kailasJavaWork;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		 Calculator c =new Calculator();
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter any two numbers");
		int a =sc.nextInt();
		int b =sc.nextInt();*/
		while(true)
		{
		System.out.println("Enter choise:\n 1.addition \n 2.Substraction \n 3.Exist");
		int choise=sc.nextInt();
		switch(choise)
		{
			case 1:c.add();
			break;
			case 2: c.sub();
			break;
			case 3: System.exit(0);
			defualt:
				System.out.println("invalid entry");
		}
		
	}

}
}