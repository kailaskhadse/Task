package Maptask;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map <String,Integer> m = new HashMap<>();
		m.put("aaa", 10);
		m.put("bbb", 20);
		m.put("ccc", 30);
		System.out.println(m);
		Set<String>keys=m.keySet();
		System.out.println(keys);
		
		for(String k:keys)
		{
			System.out.println(k);
			int x=m.get(k);
			System.out.println(x);
		}

	}

}
