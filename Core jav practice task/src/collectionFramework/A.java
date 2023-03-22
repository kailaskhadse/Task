package collectionFramework;

import java.util.*;

public class A {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>();
		l1.add(11);
		l1.add(55);
		l1.add(35);
		l1.add(44);
		List<Integer>l2=new ArrayList<>();
		l2.add(21);
		l2.add(15);
		l2.add(25);
		l2.add(24);
		Set<List<Integer>> s=new HashSet<>();
		s.add(l1);
		s.add(l2);
		Map<Integer,Set<List<Integer>>> map= new HashMap<>();
		map.put(1, s);
		Set<Integer> k1=map.keySet();
		for(Integer i:k1) {
			Set<List<Integer>> m=map.get(i);
			for(List<Integer> set:m) {
			for(Integer list:set) {
				System.out.println(list);
			}
				
		
		
		/*Iterator<Integer>it1=k1.iterator();
		while(it1.hasNext()) {
			Integer i1=it1.next();
			Set<List<Integer>> m=map.get(i1);
			Iterator<List<Integer>> it2=m.iterator();
			while(it2.hasNext()) {
				List<Integer> i2=it2.next();
				Iterator<Integer>it3=i2.iterator();
				while(it3.hasNext()) {
					Integer i=it3.next();
					System.out.println(i);*/
				}
			}
		}
		

	}


