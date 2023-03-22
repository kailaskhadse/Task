
public class ArmstrongNumber {

	public static void main(String[] args) {
		int s=150;
		int temp=s;
		int r, sum=0;
		while(s>0) {
			 r=s%10;
			 s=s/10;
			 sum=sum+(r*r*r);
		}
		if (sum==temp)
		{
			System.out.println("is a armstrong number");
		}
		else {
			System.out.println("is a not armstrong number");
		}

	}

}
