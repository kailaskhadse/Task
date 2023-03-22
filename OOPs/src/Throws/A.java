package Throws;

public class A {
	
	public void m1(int age)
	{
		if(age<18) {
			throw new InvalidAgeException("not valid for vote");
		}
		else {
			System.out.println("valid for vote");
		}
	}
public static void main(String[] args) {
	System.out.println("main start");
	A a= new A();
	try {
	a.m1(17);
	
}
	catch(InvalidAgeException e)
	{
		System.out.println("catch block");
		System.out.println(e.getMessage());
	}
}
}
