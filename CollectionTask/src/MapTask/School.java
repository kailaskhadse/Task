package MapTask;

import java.util.*;

public class School {

	public static void main(String[] args) {
	Map<String,Faculty> department1 =new HashMap<>();
	Faculty fac1=new Faculty();
	fac1.setFacultyId(111);
	fac1.setFacultyName("Raj");
	Faculty fac2=new Faculty();
	fac2.setFacultyId(222);
	fac2.setFacultyName("Rahul");
	department1.put("faculty1",fac1);
	department1.put("faculty2",fac2);
	Map<String,Faculty> department2 =new HashMap<>();
	Faculty fac3=new Faculty();
	fac3.setFacultyId(333);
	fac3.setFacultyName("Navin");
	Faculty fac4=new Faculty();
	fac4.setFacultyId(444);
	fac4.setFacultyName("Nutan");
	Faculty fac5=new Faculty();
	fac5.setFacultyId(555);
	fac5.setFacultyName("Minal");
	
	department2.put("Faculty3",fac3);
	department2.put("Faculty4",fac4);
	department2.put("Faculty5",fac5);
	Map<String,Map<String,Faculty>> school=new HashMap<>();
	school.put("dep1", department1);
	school.put("dep2", department2);
	Set<String>keys=school.keySet();
	/*for(String k :keys)
	{
		Map<String,Faculty> i1=school.get(k);
		Set<String> keys1=i1.keySet();
		for(String k1:keys1) {
			Faculty f=i1.get(k1);
			System.out.println(f.getFacultyId() +" "+f.getFacultyName()+" ");
		}
	}*/
	
	
	
	//Set<String> keys=school.keySet();
	/*for(String k:keys) {
		Map<String,Faculty>dep=school.get(k);
		Set<String> key1=dep.keySet();
		for(String s:key1)
		{
		Faculty data=dep.get(s);
		System.out.println("faculty id :"+data.getFacultyId());
		System.out.println("Faculty Name :"+data.getFacultyName());
	}*/
  school.forEach((k,v)->
  v.forEach((k1,v1)->{System.out.println("id :"+v1.getFacultyId());
  System.out.println("name :"+v1.getFacultyName());}))
  ;
	
	
	
			
	}
	
	

	}


