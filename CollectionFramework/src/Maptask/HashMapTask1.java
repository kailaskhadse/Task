package Maptask;

import java.util.*;

public class HashMapTask1 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("aaa", 10);
		m.put("bbb", 20);
		m.put("ccc", 50);
		System.out.println(m);
		int x=m.get("aaa");
		System.out.println(x);

	}

}
