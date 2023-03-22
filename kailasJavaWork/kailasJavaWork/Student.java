package kailasJavaWork;

public class Student {
	int rollnum=1;
	String name="kailas";
public void display() {
	System.out.println("rollnum is:"+ rollnum);
	System.out.println("name is:" +name);
}
public static void main (String args[])
{
	Student s=new Student();
	s.display();
}
}
