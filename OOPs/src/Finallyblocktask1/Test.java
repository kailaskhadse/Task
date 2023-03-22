package Finallyblocktask1;

public class Test {

	public int m1()
	{
		int x=10;
		System.out.println("m1---");
		try {
		System.out.println("try--block");
		return x;
	}
	
	finally
	{
		x=50;
		System.out.println("finally block x :"+x);
		return x;
	}

	}
	public static void main(String[] args) {
		System.out.println("Main start--");
		Test t = new Test();
		int x=t.m1();
		
		System.out.println(x);
	}
}
