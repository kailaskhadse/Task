package AbsratctTask1;

public class B extends A {
	public void m2() {
		System.out.println("m2..B");
	}
	public void m3() {
		System.out.println("m3..B");
	}
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
		a.m3();
	}

}
