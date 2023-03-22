package Maptask;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		List<String>mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		List<String>jr=new ArrayList<>();
		jr.add("Ranchi");
		jr.add("Dhanbad");
		Map<String ,List<String>> india =new HashMap<>();
		india.put("Maharashtra", mh);
		india.put("jharkhand", jr);
		Set<String>keys=india.keySet();
		for(String k:keys) {
		System.out.println(k);
	
		List<String>l=india.get(k);
		{
		for(String city:l) 
			System.out.println(city);
		

}
}
}}