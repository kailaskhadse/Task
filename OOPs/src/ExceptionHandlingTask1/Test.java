package ExceptionHandlingTask1;

public class Test {

	public static void main(String[] args) {
		try {
		String s=args[0];
		int x=Integer.parseInt(s);
		int a=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter input value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter non zero value");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter Number");
		}

	}

}
