package TaskList;

import java.util.*;

public class ProductSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Product>plist=null;
		System.out.println("Enter your sorting choice:\n 1.product id \n 2.product name \n 3.product price");
		int choice=sc.nextInt();
		if(choice==1) {
		Comparator<Product>cid=(o1,o2)->o1.getPid()-o2.getPid();
		plist=new TreeSet(cid);}
		else if(choice==2) {
			Comparator<Product>cnm=(o1,o2)->o1.getPname().compareTo(o2.getPname());
		plist=new TreeSet(cnm);}
		else if(choice==3) {
			Comparator<Product>cprc=(o1,o2)->o1.getPrice().compareTo(o2.getPrice());
			plist=new TreeSet(cprc);}
	
			
		
		
		
		Product p1=new Product();
		p1.setPid(111);
		p1.setPname("CCC");
		p1.setPrice(100.00);
		Product p2=new Product();
		p2.setPid(110);
		p2.setPname("BBB");
		p2.setPrice(300.00);
		Product p3=new Product();
		p3.setPid(112);
		p3.setPname("AAA");
		p3.setPrice(200.00);
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.forEach((prd)-> {
			System.out.println("Product id :"+prd.getPid());
			System.out.println("Product name :"+prd.getPname());
			System.out.println("Product price :"+prd.getPrice());
		});
		
		
		

	}

}
