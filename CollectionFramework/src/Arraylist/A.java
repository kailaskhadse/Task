package Arraylist;

import java.util.*;

public class A {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<>();
	l1.add(10);
	l1.add(20);
	List<Integer> l2=new ArrayList<>();
	l2.add(30);
	l2.add(40);
	l1.set(1, 50);
	System.out.println(l1);
	System.out.println(l2);
	System.out.println("--------------------");
	l1.addAll(l2);
	System.out.println(l1);
	l1.set(1, 50);
	System.out.println(l1);
	l1.clear();
	System.out.println(l1);
	l2.clear();
	System.out.println(l1.equals(l2));
	System.out.println(l1.isEmpty());
	System.out.println("-------------");
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	System.out.println(l1);
	System.out.println("------------------");
	l1.set(1, -20);
	l1.set(0, -10);
	l1.set(3, -40);
	l1.set(2, -30);
	System.out.println(l1);

	
	
	
	
	
	
			
}
}
