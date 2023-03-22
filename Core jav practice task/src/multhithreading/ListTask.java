package multhithreading;

import java.util.*;

public class ListTask {

	public static void main(String[] args) {
		List<String>l1=new ArrayList<>();
		l1.add("abc");
		l1.add("lmn");
		l1.add("pqr");
		Set<List<String>> s1= new HashSet<>();
		s1.add(l1);
		Map<Integer,Set<List<String>>> m1=new HashMap<>();
		m1.put(1, s1);
		Set<Integer> key1=m1.keySet();
		Iterator<Integer>it1=key1.iterator();
		while(it1.hasNext()) {
			Integer i=it1.next();
			Set<List<String>> set=m1.get(i);
			Iterator<List<String>> it2=set.iterator();
			while(it2.hasNext()) {
			List<String> s=it2.next();
			Iterator<String> it3=s.iterator();
			while(it3.hasNext()) {
				String st=it3.next();
				System.out.println(st);
			}
		}}

	}

}
