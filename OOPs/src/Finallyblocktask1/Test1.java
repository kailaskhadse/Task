package Finallyblocktask1;

public class Test1 {
	int m1()
	{
		
		try
		{
			System.out.println("try block");
			int m =10/0;
			return 50;
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		return 20;
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println(t.m1());
	}
	}


