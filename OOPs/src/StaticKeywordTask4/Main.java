package StaticKeywordTask4;

public class Main {
	public static String str="main class";
	static class MyNestedClass
	{
		public void disp()
		{
			System.out.println(str);
		}
	}
	
	public void m1() {
		Main.MyNestedClass obj=new Main.MyNestedClass();
//		MyNestedClass obj=new MyNestedClass();
		obj.disp();
	}
public static void main(String[] args) {
//	Main.MyNestedClass obj=new Main.MyNestedClass();
	MyNestedClass obj=new MyNestedClass();

//	obj.m1();
	obj.disp();
}
}
