package Arraylist;

import java.util.*;

public class Final {

	public static void main(String[] args) {
		//List
		List<String> student=new ArrayList<>();
		student.add("abc");
		student.add("xyz");
		student.add("pqr");
		student.add("abc");
		student.add(null);
		student.add(null);
		System.out.println(student);  //[abc,xyz,pqr,abc,null,null]
		
		//Set HashSet repeated element remove
		Set<String> student1=new HashSet<>();
		student1.add("abc");
		student1.add("xyz");
		student1.add("pqr");
		student1.add("abc");
		student1.add(null);
		student1.add(null);
		System.out.println(student1);//[pqr,null,abc,xyz]
		//set LinkedHashset repeated element remove sort in assending order
		Set<String> student2=new LinkedHashSet<>();
		student2.add("abc");
		student2.add("xyz");
		student2.add("pqr");
		student2.add("abc");
		student2.add(null);
		student2.add(null);
		System.out.println(student2);//[abc,xyz,pqr,null
		//Map class HashMap
		Map<Integer,String> smap= new HashMap<>();
		smap.put(2, null);
		smap.put(2, null);
		smap.put(1, "aa");
		smap.put(1,"bb");
		smap.put(3, "bb");
		System.out.println(smap);//{1=bb,2=null,3=bb, keys be unique,values can same or null
		Map<Integer,String> smap1= new TreeMap<>();
		smap1.put(2, null);
		smap1.put(2, null);
		smap1.put(1, "aa");
		smap1.put(1,"bb");
		smap1.put(3, "bb");
		System.out.println(smap1);//{1=bb,2=null,3=bb, keys be unique,values can same or null
		
		
		
		
		
		
		/*Student s1=new Student();
		s1.setName("kailas");
		s1.setRollno(1);
		Student s2=new Student();
		s2.setName("Rahul");
		s2.setRollno(2);
		Student s31=new Student();
		s31.setName("Raj");
		s31.setRollno(3);*/

	}

}
