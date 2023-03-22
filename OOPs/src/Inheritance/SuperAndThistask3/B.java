package Inheritance.SuperAndThistask3;

public class B extends A {
	public B()
	{
		this("xyz");
		System.out.println("B..def const");
	}
	public B(int i)
	{
		System.out.println("B int const");
		
	}
	public B(String s)
	{
		System.out.println("B string cons");
	}
}
