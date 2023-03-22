package Arraylist;

import java.util.*;

public class ListIndia {
	public static void main(String[] args) {
		List<String>Maharashtra= new ArrayList<>();
		Maharashtra.add("Mumbai");
		Maharashtra.add("Pune");
		Maharashtra.add("Nagpur");
		List<String>Goa= new ArrayList<>();
		Goa.add("Panjim");
		Goa.add("Mhapusa");
		List<List<String>> India = new ArrayList<>();
		India.add(Maharashtra);
		India.add(Goa);
		Iterator<List<String>> itrl= India.iterator();
		/*while(itrl.hasNext())
			{ 
			List<String>s=itrl.next();
			Iterator<String>itr2=s.iterator();
			while(itr2.hasNext())
			{
				String city =itr2.next();
				System.out.println(city);
			}*/
		for(List<String>state : India)
		{
			for (String city :state) {
				System.out.println(city);
			}
		}
		
		
  		
	}

}
