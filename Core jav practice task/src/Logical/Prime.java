package Logical;

public class Prime {

	public static void main(String[] args) {
		int x=47; int f=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				f++;
			}
		}
		if(f==0)
		{
			System.out.println("Is prime number");
		}
		else {
			System.out.println("Is not prime number");
		}
	}

}
