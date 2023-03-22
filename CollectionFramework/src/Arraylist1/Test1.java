package Arraylist1;

import java.util.*;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Product> pList=new ArrayList<>();  
		List<Supplier> sList=new ArrayList<>();
		//Product p= new Product();
		System.out.println("Enter number product added");
		int x= sc.nextInt();
		for(int i=0; i<x;i++){
			Product p=new Product();
			System.out.println("Enter product id" ); 
			p.setProductId(sc.nextInt());
			System.out.println("Enter product name");
			p.setProductName(sc.next());
			System.out.println("Enter product price");
			p.setProductPrice(sc.nextDouble());
			pList.add(p);
		}
		//Supplier s = new Supplier();
		System.out.println("Enter number supplier to be added");
		int y=sc.nextInt();
		for(int i=0;i<y;i++) {
			Supplier s = new Supplier();
			System.out.println("Enter supplier id");
			s.setSupplierId(sc.nextInt());
			System.out.println("Enter supplier name");
			s.setSuplierName(sc.next());
			System.out.println("Enter supplier mobile number");
			s.setMobileNum(sc.nextLong());
			System.out.println("Enter product id");
			int m=sc.nextInt();
			Iterator<Product>itr=pList.iterator();
			while(itr.hasNext()) {
				Product pr=itr.next();
				int n=pr.getProductId();
				if(m==n) {
					s.setPro(pr);
				}
				
		}
			sList.add(s);
		}
		Iterator<Supplier>itr1=sList.iterator();
		while(itr1.hasNext()) {
			Supplier sup=itr1.next();
			System.out.println(sup.getSupplierId());
			System.out.println(sup.getSuplierName());
			System.out.println(sup.getMobileNum());
			System.out.println(sup.getPro().getProductId());
			System.out.println(sup.getPro().getProductName());
			System.out.println(sup.getPro().getProductPrice());
		}

		
	}

}
