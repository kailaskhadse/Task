package kailasJavaWork;

public class Methods {
	public void add() {
	int a=200;
	int b=50;
	int c=a+b;
	System.out.println("Addition is " +c);
}
public void sub (int a,int b)
{
	int c= a-b;
	System.out.println("Substraction is "+c);
}
public int mul() {
int a=15;
int b=20;
int c=a*b;
return c; 
}
public int div(int a, int b) {
int c= a/b;
return c ;
}

	public static void main(String[] args) {
		Methods m = new Methods ();
		m.add();
		m.sub(50,20);
		m.mul();
		System.out.println(m.mul());
		int x= m.div(200 ,50);
		System.out.println(x);
	}
}
	



