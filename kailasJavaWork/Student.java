
public class Student {
int rollnum;
String name;
static String schoolname="RSSS";
public Student(int rollnum,String name)
{
	this.rollnum=rollnum;
	this.name=name;
}
public void display()
{
	System.out.println(rollnum+" " +name+" " +schoolname);

}
	public static void main(String[] args) {
	Student s1=	new Student(1,"Kailas");
	s1.display();
	Student s2=	new Student(2,"Karan");
	s2.display();
	Student s3=	new Student(3,"Rahul");
	s3.display();
	}

}
