package StaticKeyword;

public class A {
	int x;
	static int y;

	public void m1()
	{
		x=10;
		y=30;
	}
	public static void m2()
	{
		//x=20; does not initialize not static variable in static method.
		y=100;
		System.out.println("m2 static method");
	}
	static {
		
		System.out.println("Static block");
	}
	//non static block
	{
		System.out.println("non static block");
	}

}
