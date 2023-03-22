package ComparableTask;

import java.util.*;
/*import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;*/

public class Test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		Set<Student1> s=null;
		System.out.println("Enter your choice: \n1.Roll number sorting \n 2.Name sorting");
		int choice=sc.nextInt();
		if(choice==1) {
			Comparator<Student1> r=(r1,r2)->r1.getRollno()-r2.getRollno();
			s=new TreeSet<>(r);
		}
		else if(choice==2){
			Comparator<Student1> nm=(r1,r2)->r1.getName().compareTo(r2.getName());
			s=new TreeSet(nm);
		}
			
			Student1 s1=new Student1();
			s1.setName("aa");
			s1.setRollno(2);
			
			Student1 s2=new Student1();
			s2.setName("cc");
			s2.setRollno(1);
			
			Student1 s3=new Student1();
			s3.setName("bb");
			s3.setRollno(3);
			
			s.add(s1);
			s.add(s2);
			s.add(s3);
			s.forEach((stu)->System.out.println(stu.getName()+" "+stu.getRollno()));
			
	}
}


