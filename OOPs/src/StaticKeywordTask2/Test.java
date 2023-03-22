package StaticKeywordTask2;

public class Test {
static int a=10;
int b=20;
static void m1()
{
	a=20;
	System.out.println("m1 static");
	//b=10; it gives error, non static variable
	//m2(); compile error, non static method
}
public void m2()
{
	System.out.println("m2 non stati ");
m1();
b=20;
a=10;
}
public static void main(String[] args) {
	m1();
	//m2();
	Test t = new Test();
	t.m2();
}
}
