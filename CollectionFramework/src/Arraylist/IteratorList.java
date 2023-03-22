package Arraylist;

import java.util.*;
//import java.util.List;
//import java.util.ListIterator;

public class IteratorList {

	public static void main(String[] args) {
		 List booklist = new ArrayList();
		  booklist.add("java");
		  booklist.add("c+");
		  booklist.add("c#");
		  booklist.add("c++");
		  booklist.add("sql");
		  booklist.add("python");
		  System.out.println(booklist);
		 // System.out.println("printing forward directin");
		  ListIterator ltr =booklist.listIterator();
		  while(ltr.hasNext())
		  {
			  Object elemnt=ltr.next();
			  System.out.print(elemnt+",");
		  }
		  System.out.println();
		// System.out.println("printing backword direction");
		  while(ltr.hasPrevious()) {
			  Object elemnt=ltr.previous();
			  System.out.print(elemnt+",");
		  }
			  System.out.println();
		  }
		  


	}


