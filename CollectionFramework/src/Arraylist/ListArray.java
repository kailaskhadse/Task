package Arraylist;

import java.util.*;

public class ListArray {

	public static void main(String[] args) {
		List<String>washim = new ArrayList<>();
		washim.add("Risod");
		washim.add("Malegaon");
		washim.add("Karanja");
		washim.add("Mangulpir");
		washim.add("Washim");
		List<String>buldana = new ArrayList<>();
		buldana.add("Mehakar");
		buldana.add("Lonar");
		buldana.add("Chikhali");
		buldana.add("Mulkapur");
		List<List<String>> maharashtra= new ArrayList<>();
		maharashtra.add(washim);
		maharashtra.add(buldana);
		System.out.println(maharashtra);
		/*for(List<String>dist:maharashtra)
		{
			for(String taluka:dist)
			{
				System.out.println(taluka);
			}
		}*/
	
	Iterator<List<String>> itr=maharashtra.iterator();
	while(itr.hasNext()) {
		List<String> s=itr.next();
		Iterator<String>itr1=s.iterator();
		while(itr1.hasNext()) {
			String taluka=itr1.next();
			System.out.print(taluka+",");
		}
	}
				
		

	}

}
