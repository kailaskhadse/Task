package ExceptionHandlingTask1;

public class TryCatch {
public static void main(String[] args) {
	System.out.println("Main start");
	try {
		int x=10/0;
	}
	catch(ArithmeticException k)
	{
		System.out.println("catch bock");
//		System.out.println(k );
//		System.out.println("---------------------------------------------");
//		k.printStackTrace();
		System.out.println(k.getMessage());
//		System.out.println(k.toString());
//		System.out.println("main end");
	}
	}
}

