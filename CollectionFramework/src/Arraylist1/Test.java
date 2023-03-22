package Arraylist1;

import java.beans.beancontext.BeanContextServicesListener;
import java.util.*;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class Test {

	public static void main(String[] args) {
		
		Product p=new Product();
		p.setProductId(1);
		p.setProductName("abc");
		p.setProductPrice(1200);
		Product p1=new Product();
		p1.setProductId(2);
		p1.setProductName("xyz");
		p1.setProductPrice(13200);
		Product p2=new Product();
		p2.setProductId(3);
		p2.setProductName("lmn");
		p2.setProductPrice(1300);
		List<Product>pList=new ArrayList<>();
		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		
		
		Supplier s=new Supplier();
		s.setSupplierId(11);
		s.setSuplierName("sup1");
		s.setMobileNum(9785555L);
		/*Supplier sp1=new Supplier();
		sp1.setSupplierId(12);
		sp1.setSuplierName("sss1");
		sp1.setMobileNum(97855551L);*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id");
		int x=sc.nextInt();
		Iterator<Product> itr=pList.iterator();
		while(itr.hasNext()) {
			Product t=itr.next();
			if(t.getProductId()==x)
			{
				s.setPro(t);
			}}
		List<Supplier>sList=new ArrayList<>();
		sList.add(s);
		//sList.add(sp1);
		Iterator<Supplier>itr1=sList.iterator();
		while(itr1.hasNext()) {
			Supplier s1=itr1.next();
			System.out.println(s1.getSuplierName());
			System.out.println(s1.getSupplierId());
			System.out.println(s1.getMobileNum());
			System.out.println(s1.getPro().getProductId());
			System.out.println(s1.getPro().getProductName());
			System.out.println(s1.getPro().getProductPrice());
		}
			
		
		

	
		

	}

}
