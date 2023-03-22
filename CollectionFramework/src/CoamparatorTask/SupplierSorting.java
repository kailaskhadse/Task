package CoamparatorTask;

import java.util.*;

public class SupplierSorting {

	public static void main(String[] args) {
	Set<Supplier> sup=null;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter choise for sorting decending order: \n 1.id \n 2.name \n 3.city");
	int choise=sc.nextInt();
	if(choise==1)
	{
		Comparator<Supplier>cid=(o1,o2)->o2.getSid()-o1.getSid();
		sup=new TreeSet<>(cid);
	}
	else if(choise==2)
	{
		Comparator<Supplier>cname=(o1,o2)->o2.getSname().compareTo(o1.getSname());
		sup=new TreeSet<>(cname);
	}
	else if(choise==3)
	{
		Comparator<Supplier>ccty=(o1,o2)->o2.getScity().compareTo(o1.getScity());
		sup=new TreeSet<>(ccty);
	}
	Supplier s1=new Supplier();
	s1.setSid(3);
	s1.setSname("bablu");
	s1.setScity("pune");
	Supplier s2=new Supplier();
	s2.setSid(1);
	s2.setSname("charan");
	s2.setScity("akola");
	Supplier s3=new Supplier();
	s3.setSid(2);
	s3.setSname("Amol");
	s3.setScity("Buldana");
	sup.add(s1);
	sup.add(s2);
	sup.add(s3);
	for(Supplier s:sup) {
		System.out.println(s.getSid()+" "+s.getSname() +" "+s.getScity());
		
	}
	
	
	
	
	
	
	
	
	
	

	

	} /*public void city() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter city ");
		String ct=sc.next();
		for(int i=0;i<3;i++) {
			if(ct==)*/
			
			
		}
	}

} 
