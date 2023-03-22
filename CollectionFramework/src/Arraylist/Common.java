package Arraylist;

import java.util.ArrayList;

public class Common {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("D");
		l1.add("W");
		l1.add("K");
		l1.add("M");
		l1.add("N");
		l1.add("X");
		ArrayList l2=new ArrayList();
		l2.add("X");
		l2.add("A");
		l2.add("P");
		l2.add("W");
		l2.add("D");
		l2.add("S");
		l2.add("B");
		l2.retainAll(l1);
	System.out.println("common element bet ll and l2:"+l2);
		

	}

}
