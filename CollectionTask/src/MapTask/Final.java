package MapTask;

import java.util.*;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> s=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choise: \n.1.Rollnum sort \n 2.name sort \n 3.age sort");
		int ch= sc.nextInt();
		if(ch==1) {
			Comparator<Student>crl=(o1,o2)->o1.getRollno()-o2.getRollno();
			s=new TreeSet (crl);
		}
		else if(ch==2) {
			Comparator<Student>cnm=(o1,o2)->o1.getName().compareTo(o2.getName());
			s=new TreeSet (cnm);
		}
		else if(ch==3) {
			Comparator<Student>cag=(o1,o2)->o1.getAge()-o2.getAge();
			s=new TreeSet (cag);
		}
		Student s1=new Student();
		s1.setRollno(3);
		s1.setName("bb");
		s1.setAge(20);
		Student s3=new Student();
		s3.setRollno(2);
		s3.setName("aa");
		s3.setAge(21);
		Student s2=new Student();
		s2.setRollno(1);
		s2.setName("cc");
		s2.setAge(22);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.forEach((stu)->System.out.println(stu.getRollno()+" "+stu.getName()+" "+stu.getAge()));
	}

}
