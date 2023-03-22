package Logical;

import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		// to find vowels from given string
		String s="Tapacademy";
		List <String>l= new ArrayList<>();
		l.add("a");
		l.add("e");
		l.add("i");
		l.add("o");
		l.add("u");
		for(int i=0;i<s.length();i++)
		{
			if(l.contains(s.charAt(i)))
			{
				System.out.println(i);
			}
		}
		

	}

}
