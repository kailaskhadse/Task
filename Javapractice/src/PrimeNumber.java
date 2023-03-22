
public class PrimeNumber {
	public static void main(String[] args) {
		for(int i =1; i<=20;i++)
		{ int f=0;
			for(int j=2;j<i-1;j++)
			{ if(i%j==0) {
				f=f+1;
			}}
			if(f==0) { 
				System.out.println(i);
			}
			else
			{ 
				f=0;
			}
				
		}
	}

}
