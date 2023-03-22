package SecondaryRef;

public class A {
public void m1(A k) {
	System.out.println("object method");
	
}
public void m1(int a) {
	System.out.println("int method");
}
public static void main(String[] args) {
	A a= new A();
	a.m1((A)null);
	a.m1((int) 0);
}
}
