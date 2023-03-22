package practiceCode;

import java.util.Scanner;

public class ChocaletWraper {
	
	public int chocowrap(int totalMoney,int chocPrice, int noOfWrapper)
	{
		int choco=totalMoney/chocPrice;
		int wrap=choco;
		int newChoco=0;
		while(wrap>=noOfWrapper)
		{
			newChoco=wrap/noOfWrapper;
			choco=choco+newChoco;
			wrap=wrap%noOfWrapper+newChoco;
			
		}
		return choco;
	}

	public static void main(String[] args) {
		ChocaletWraper  ch=new ChocaletWraper();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total money :");
		int m=sc.nextInt();
		System.out.println("Enter cost of per chocolate :");
		int c =sc.nextInt();
		System.out.println("Enter num of wrapper required for one chocolate :");
		int w=sc.nextInt();
		int noOfChocaletGet=ch.chocowrap(m,c,w);
System.out.println("Total no Of Chocalet Get :"+ noOfChocaletGet);
	}

}
