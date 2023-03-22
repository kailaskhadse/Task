package LambdaExpression;

import java.util.*;

public class B {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(1, "abc");
		m.put(2, "xyz");
		m.put(3, "lmn");
		 
		m.forEach((k,v)->{System.out.println(k);
		System.out.println(v);
		});
		
		

	}

}
