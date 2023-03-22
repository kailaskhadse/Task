package Inheritance.SuperAndThistask5;

public class Y extends X {
	public Y()
	{
		this(121l,'c');
	}
	public Y(long l,char ch)
	{ 
	
		System.out.print("xyz"+" ");
	}
	public Y(double d1,float f1)
	{
		super(12.5d,4.0f);
		
		System.out.print("abc"+" ");
	}
}
