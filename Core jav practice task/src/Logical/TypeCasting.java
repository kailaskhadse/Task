package Logical;

public class TypeCasting {
	public Object m1() {
		return "cjc";
		
	}
	public String m2() {
		return "java";
	}
public static void main(String[] args) {
	TypeCasting t = new TypeCasting();
String s =(String)t.m1();//Type casting object into string
Object s1=t.m1();
	String s2=t.m2();
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
}
}
