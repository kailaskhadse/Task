package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("C");
		al.add("B");
		al.add("D");
		al.add("A");
		al.add("E");
		Collections.sort(al);
		System.out.println(al);
		//Collections.sort(al,Collections.reverseOrder());
		//System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		/*Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.print(o);
		}*/
		
		
	}

}
