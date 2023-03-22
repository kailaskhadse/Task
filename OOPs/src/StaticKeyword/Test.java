package StaticKeyword;

public class Test {
	public static void main(String[] args) {
		//System.out.println(A.x);
		System.out.println(A.y);
		A a = new A();
		a.m1();
		//A.m1(); non static method not call through class name
		a.m2();
		System.out.println(A.y);
		A.m2();
		
		
		
	}

}

