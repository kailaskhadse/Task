package Set;

import java.util.*;

public class B {

	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(11);
		al.add("abc");
		al.add('c');
		al.add(10.10);
		char c=(char)al.get(2);
		System.out.println(c);
		System.out.println(al.get(1));
		String s=(String)al.get(1);
		System.out.println(s);
		
		

	}

}
