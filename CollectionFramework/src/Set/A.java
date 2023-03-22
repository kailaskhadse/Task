package Set;

import java.util.*;

public class A {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>();
		s.add(4);
		s.add(20);
		s.add(4);
		s.add(2);
		System.out.println(s);
		/*Iterator<Integer>itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		for(int x:s) {
			System.out.println(x);
		}

	}

}
