package ComparableTask;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	Set<Student>s=new TreeSet<>();
	Student s1=new Student();
	s1.setName("aa");
	s1.setRollno(2);
	Student s2=new Student();
	s2.setName("cc");
	s2.setRollno(1);
	Student s3=new Student();
	s3.setName("bb");
	s3.setRollno(3);
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.forEach((stu)->System.out.println(stu.getName()+" "+stu.getRollno()));
	
	
	
	

	}

}
