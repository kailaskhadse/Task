package LambdaExpression;

import java.util.*;

public class A {

	public static void main(String[] args) {
		List<String>l=new ArrayList<>();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		List<String>l1=new ArrayList<>();
		l1.add("lmn");
		l1.add("pqr");
		l1.add("xyz");
		System.out.println(l1);
		l1.removeAll(l1);
		System.out.println(l1);
		List<List<String>> list=new ArrayList();
		list.add(l);
		list.add(l1);
		list.forEach((object)->//System.out.println(object)
		object.forEach((a)->System.out.println(a)));
		
		//list.forEach(System.out::println);
		

	}

}
