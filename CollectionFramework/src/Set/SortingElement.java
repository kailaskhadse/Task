package Set;

import java.util.*;

public class SortingElement {

	public static void main(String[] args) {
		List<Integer>al=new ArrayList<>(); 
		al.add(11);
		al.add(80);
		al.add(70);
		al.add(50);
		al.add(60);
		al.add(11);
		al.add(70);
		/*System.out.println(al);//[11,80,70,50,60,11,70]
		//sorting elemnet by using collectoins method
		Collections.sort(al);
		System.out.println(al);//[11,50,60,70,70,80]
		//*/
		/*Set<Integer>s=new TreeSet<>(al);
		System.out.println(s);*/
		Set<Integer> s= new HashSet(al);
		System.out.println(s);
		Set<Integer> s1= new LinkedHashSet<>(al);
		System.out.println(s1);
		

	}

}
