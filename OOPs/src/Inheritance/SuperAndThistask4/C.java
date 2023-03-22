package Inheritance.SuperAndThistask4;

public class C extends B {
	int x=40;
	public void m5()
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		A a = new A();
		System.out.println(a.x);
     
   


	}

}
