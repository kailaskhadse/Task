package ThrownsKeyword;

import java.io.IOException;



public class A {
public void m1() {
	System.out.println("m1 start");
	B b = new B();
	try {
		b.m2();
	}
	catch(IOException e)
	{
		System.out.println("catch block");
	}
	System.out.println("m1 end");
}
public static void main(String[] args) {
	System.out.println("main start");
	A a = new A();
	a.m1();
}
}
