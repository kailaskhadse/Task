package Arraylist;

import java.util.*;

public class Final1 {
	public static void main(String[] args) {
	Student1 s= new Student1();
	s.setRollNo(1);
	s.setName("xyz");
	Student1 s1=new Student1();
	s1.setRollNo(2);
	s1.setName("abc");
	List<Student1> list=new ArrayList<>();
	list.add(s);
	list.add(s1);
	for(Student1 st:list) {
		System.out.println(st.getRollNo());
		System.out.println(st.getName());

}
}}