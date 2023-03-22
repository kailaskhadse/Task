package collectionFramework;

import java.util.*;

public class Mapdemo {

	public static void main(String[] args) {
		Map<Integer,String> clas1=new HashMap<>();
		clas1.put(1, "A");
		clas1.put(2, "B");
		clas1.put(3, "C");
		
		Map<Integer,String> clas2=new HashMap<>();
		clas2.put(4, "X");
		clas2.put(5, "Y");
		clas2.put(6, "Z");
		Map<Integer,Map<Integer,String>> school=new HashMap<>();
		school.put(1, clas2);
		school.put(2, clas1);
		Map<Integer,Map<Integer,Map<Integer,String>>> uni=new HashMap<>();
		uni.put(1, school);
		Set<Integer> key1=school.keySet();
		Iterator<Integer>itr1=key1.iterator();
		while(itr1.hasNext()) {
		Integer i1	=itr1.next();
		Map<Integer,Map<Integer,String>> m1=uni.get(i1);
		Set<Integer> key2=m1.keySet();
	Iterator<Integer> itr2=key2.iterator();
	while(itr2.hasNext()) {
		Integer i2=itr2.next();
		Map<Integer,String> m2=m1.get(i2);
		//System.out.println(m2);
		Set<Integer>key3=m2.keySet();
		Iterator<Integer> itr3=key3.iterator();
		while(itr3.hasNext()) {
			Integer i3=itr3.next();
			String s=m2.get(i3);
			System.out.println(s);
			
		}
		
	}
		
		}
		

	}

}
