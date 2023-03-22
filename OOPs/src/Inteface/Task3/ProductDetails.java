package Inteface.Task3;

import java.util.Scanner;

public class ProductDetails implements Services{
	Scanner sc= new Scanner(System.in);
	Product p[]= new Product[5];
	int x;
	public void addDetails()
	{
		System.out.println("Enter no add to product");
		this.x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			Product p1= new Product();
			System.out.println("Enter product Id");
			p1.setProductId(sc.nextInt());
			System.out.println("Enter product Name");
			p1.setProductName(sc.next());
			System.out.println("Enter product Price");
			p1.setProductPrice(sc.nextDouble());
			System.out.println("Enter product Type");
			p1.setType(sc.next());
	
	   p[i]=p1;
	
		}}
		public void getDetails()
		{
			for(int i=0;i<x;i++)
			{
				System.out.println("Product id :"+p[i].getProductId());
				System.out.println("Product Name :"+p[i].getProductName());
				System.out.println("Product Price :"+p[i].getProductPrice());
				System.out.println("Product Type :"+p[i].getType());
				
			}
		}
		public void getDetailsByid(int id)
		{
			int f=0;
			System.out.println("Enter product id to fetch details");
			int y=sc.nextInt();
		
			for(int i=0;i<x;i++)
			{
				if(p[i].getProductId()==y)
				{
				System.out.println("Product id :"+p[i].getProductId());
				System.out.println("Product Name :"+p[i].getProductName());
				System.out.println("Product Price :"+p[i].getProductPrice());
				System.out.println("Product Type :"+p[i].getType());
				}
				if(f==0)
					System.out.println("Enter valid id");
			}
		}
}
			//public void updateDetailsByid(int id)
			
				
			


				
	
				
				
				

