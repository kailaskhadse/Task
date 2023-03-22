package Arraylist;

import java.util.*;

public class C {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(11);
		l1.add(12);
		l1.add(12);
		l1.add(14);
		List<Integer> l2=new ArrayList<>();
		l2.add(11);
		l2.add(10);
		l2.add(15);
		l2.add(14);
		System.out.println(l1.indexOf(12));
		if(l1.equals(l2)) {
			System.out.println("Equal");
		}
			else {
				System.out.println("Not Equal");
			}
				
			
	System.out.println(	l1.contains(14));
	boolean ans=l1.contains(16);
	if(ans) {
		System.out.println("The list contain 16");
	}
	else {
		System.out.println("The list does not contain 16");
	}
	}

}
