package Arraylist;

import java.util.*;

public class Test1 {
		public static void main(String[] args) {
			List <String> l= new ArrayList<>();
			l.add("aa");
			l.add("bb");
			l.add("cc");
			System.out.println(l);
			//System.out.println(l.get(2));
			Iterator<String> itr =l.iterator();
			/*while(itr.hasNext())
			{
				String x=itr.next();
				System.out.println(x);
			}*/
			for(String x:l)
			{
				System.out.println(x );
			}
		}

	}



