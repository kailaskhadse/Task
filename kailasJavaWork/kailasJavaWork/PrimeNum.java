package kailasJavaWork;

public class PrimeNum {

	public static void main(String[] args) {
		for(int i=2; i<=20;i++) {
			int f=0;
			for(int j=2; j<=i-1;j++) {
				if(i%j==0) {
				f++;
			}}
			if(f==0) {
				System.out.print(i+" ");
			
		
			}
	}

}}
