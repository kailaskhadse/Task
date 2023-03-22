package MapTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public List<Student>  addList( ) {
	List<Student>l= new ArrayList<>();
	Student s1 = new Student();
	s1.setName("komal");
	s1.setRollno(1);
	Student s2 = new Student();
	s2.setName("kailas");
	s2.setRollno(2);
	l.add(s1);
	l.add(s2);
	return l;
	}
	public Set<Student> addSet() {
		Set<Student>s= new HashSet<>();
		Student s3 = new Student();
		s3.setName("komal1");
		s3.setRollno(3);
		Student s4 = new Student();
		s4.setName("kailas1");
		s4.setRollno(4);
		s.add(s3);
		s.add(s4);
		return s;
	}
	public Map<Integer, Collection<Student>> addMap() {
		Test t= new Test();
		List<Student>l1= t.addList();
		Set<Student>s1= t.addSet();
        Map<Integer,Collection<Student>> m= new HashMap<>();
		m.put(1, l1);
		m.put(2,s1);
		return m;
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		 Map<Integer,Collection<Student>> m=t.addMap();
		Set<Integer>key1=m.keySet();
		Iterator<Integer>itr=key1.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			Collection<Student> k=m.get(i);
			Iterator<Student> itr1=k.iterator();
			while(itr1.hasNext()) {
				Student st=itr1.next();
				System.out.println("student :" +st.getName()+" "+st.getRollno());
			}
			
		}
		
		
	}

}
