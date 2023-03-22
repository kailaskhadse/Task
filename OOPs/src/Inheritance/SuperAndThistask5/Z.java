package Inheritance.SuperAndThistask5;

public class Z extends Y {
	public Z(String s) 
	{  super(12.4d,4.4f);
		System.out.print("Thank"+" ");
	}
	public Z(String s2,String s3) 
	{ 
		this("s");
		System.out.print("You"+" ");
	}
	public Z(int x, long y)
	{
		this();
		System.out.print("I am"+" ");
	}
	public Z()
	{
	 this("a","b");
		System.out.print(","+" ");
	}
}
