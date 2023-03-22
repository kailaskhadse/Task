package PolymorphisTask2;

public class Test {

	public static void main(String[] args) {
		Substraction s= new Substraction();
		int c= s.operation(20, 10);
		System.out.println("Substarction:" +c);
		Addition a= new Addition();
		int f=a.operation(20,10);
		System.out.println("Addition:" +f);
		Multiplication m =new Multiplication();
		int d= m.operation(20, 10);
		System.out.println("Multiplication:" +d);
		Division di = new Division();
		int h= di.operation(20, 10);
		System.out.println("Division:" +h);

	}

}
