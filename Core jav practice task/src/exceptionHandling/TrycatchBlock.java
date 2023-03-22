package exceptionHandling;

public class TrycatchBlock {
	public void m1() {
		try {
			System.out.println("Try start..");
			int x=10;
			int y=x/0;
			System.out.println("Try end..");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
		String s	=e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		System.out.println("main block");
		TrycatchBlock t = new TrycatchBlock();
		t.m1();
	}
	

}
