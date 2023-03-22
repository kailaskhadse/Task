package Arraylist;

import java.util.*;

public class D {
	public static void main(String[] args) {
		List <Integer> l=new ArrayList <>();
		l.add(3);
		l.add(14);
		l.add(90);
		l.add(22);
		l.add(78);
		l.add(53);
		l.add(9);
		l.add(18);
		l.add(62);
		l.add(41);
		System.out.println(l);
		System.out.println("----------------");
		for(int i=0;i<l.lastIndexOf(41);i++)
		{
		
		if(l.get(i)%2!=0) {
		
		l.remove(i);
		i--;}
		}
		
		System.out.println(l);
			
			
		}
		
	}
	


