package Inheritance.SuperAndThistask7;

public class Child extends Parent {
	public void display()
	{
		System.out.println("Hi i am child method");
	}
 public void print()
 {
	 super.display();
	 display();
 }
}
