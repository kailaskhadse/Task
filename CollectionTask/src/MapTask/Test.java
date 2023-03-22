package MapTask;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<String,Student> class1=new HashMap<>();
		Student s1 =new Student();
		s1.setRollno(1);
		s1.setName("AAA");
		s1.setAge(20);
		Student s2 =new Student();
		s2.setRollno(2);
		s2.setName("BBB");
		s2.setAge(21);
		Student s3 =new Student();
		s3.setRollno(3);
		s3.setName("CCC");
		s3.setAge(22);
		class1.put("Student1", s1);
		class1.put("Student2", s2);
		class1.put("Student3", s3);
		Map<String,Student> class2=new HashMap<>();
		Student s4 =new Student();
		s4.setRollno(4);
		s4.setName("DDD");
		s4.setAge(24);
		Student s5 =new Student();
		s5.setRollno(5);
		s5.setName("EEE");
		s5.setAge(25);
		
		class2.put("Student4", s4);
		class2.put("Student5", s5);
				
		Map<Integer,Map<String,Student>> school=new HashMap<>();
		school.put(1, class1);
		school.put(2, class2);
		Set<Integer> keys=school.keySet();
		for(Integer i:keys) {
			Map<String,Student> m=school.get(i);
			Set<String> keys1=m.keySet();
           System.out.println(keys1);
			for(String s:keys1) {
				Student st=m.get(s);
					
						
				System.out.println(st.getRollno());
				System.out.println(st.getName());
				System.out.println(st.getAge());
			}
		
		}

	}

}
