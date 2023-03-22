package multhithreading;

import java.util.*;

public class ComparableTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<Student>s=new TreeSet<>();
       Student s1= new Student();
       s1.setName("abc");
       s1.setRollnum(2); 
       Student s2= new Student();
       s2.setName("xyz");
       s2.setRollnum(1);
       s.add(s1);
       s.add(s2);
       Iterator<Student>itr=s.iterator();
       while(itr.hasNext()) {
    	   Student st=itr.next();
    	   System.out.println(st.getName());
    	   System.out.println(st.getRollnum());
       }

      
	}

}
