package StaticKeywordTask5;

public class Test {
	static int count1;
	int count2;
	public static void staticIncrement()
	{
		count1++;
		System.out.println("Current value of count1 is" + count1);
		
	}
	public void nonstaticIncrement()
	{
		count2++;
		System.out.println("Current value of count2 is" + count2);
		
	}
}
