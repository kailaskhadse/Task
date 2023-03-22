package CollectionMethodsTask;

import java.util.*;

public class A {

	public static void main(String[] args) {
		Set<Integer>setInt=new HashSet<>(Arrays.asList(1,2,3,4,5));
		System.out.println("Set of integer "+setInt);
		setInt.forEach((s)->System.out.println(s));
		Set<Integer>set=new HashSet<>();
		set.add(4);
		set.add(5);
		set.add(7);
		set.add(8);
		System.out.println("set "+set);
		Set<Integer>set1=new HashSet<>();
		set1.add(4);
		set1.add(5);
		set1.add(7);
		//set1.add(8);
		System.out.println("set "+set1);
		System.out.println("Set removed all set1 :"+set.removeAll(set1));
		System.out.println(set);
	
	

	}

}
