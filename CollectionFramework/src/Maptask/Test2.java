package Maptask;

import java.util.*;

public class Test2 {
// add elements by map
	public static void main(String[] args) {
		Map<Integer, String> mh = new HashMap<>();
		mh.put(1, "Pune");
		mh.put(2, "Mumbai");
		mh.put(3, "Nagpur");
		Map<Integer, String> jr = new HashMap<>();
		jr.put(1, "Ranchi");
		jr.put(2, "Jd");
		Map<String, Map<Integer, String>> India = new HashMap<>();
		India.put("Maharashtra", mh);
		India.put("Jharkhand", jr);
		System.out.println(India);
		Set<String> keys = India.keySet();
		System.out.println(keys);
		for (String s : keys) {
			System.out.println(keys);
			System.out.println("------------------------------------------");
			Map<Integer, String> m1 = India.get(s);
			//System.out.println(m1);
			Set<Integer> key = m1.keySet();
			System.out.println(key);
			for (Integer s1 : key) {
				String city = m1.get(s1);
				System.out.println(city);

			}
		}

	}

}
