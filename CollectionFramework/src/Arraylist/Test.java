package Arraylist;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List <Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		l.remove((Object)(30));
		System.out.println(l);
		//System.out.println(l.get(2));
		/*Iterator<Integer> itr =l.iterator();
		/*while(itr.hasNext())
		{
			int x=itr.next();
			System.out.println(x);
		}
		for(int x:l)
		{
			System.out.print(x+" "+",");
		}*/
	}

}
