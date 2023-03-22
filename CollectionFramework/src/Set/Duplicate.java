package Set;

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer>al= new ArrayList<>();
		al.add(11);
		al.add(22);
		al.add(66);
		al.add(44);
		List<Integer>al1=new ArrayList<>();
		al1.add(22);
		al1.add(15);
		al1.add(44);
		al1.add(16);
		al1.add(20);
		al.retainAll(al1);
		System.out.println(al);
		
		

	}

}
