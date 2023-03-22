package Inteface.Task3;

import java.util.Scanner;

public class SupplierDetails {

	Scanner sc= new Scanner(System.in);
	Supplier s[]= new Supplier[5];
	int x;
	public void addDetails()
	{
		System.out.println("Enter no add to dealer");
		this.x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			Supplier s1= new Supplier();
			System.out.println("Enter Supplier Id");
			s1.setSupId(sc.nextInt());
			System.out.println("Enter Supplier Name");
			s1.setSupName(sc.next());
			System.out.println("Enter Supplier contact");
			s1.setContactno(sc.nextLong());
			System.out.println("Enter Supplier city");
			s1.setSupCity(sc.next());
	
	   s[i]=s1;
	
		}}
		public void getDetails()
		{
			for(int i=0;i<x;i++)
			{
				System.out.println("Supplier id :"+s[i].getSupId());
				System.out.println("Supplier Name :"+s[i].getSupName());
				System.out.println("Supplier contactno:"+s[i].getContactno());
				System.out.println("Supplier city :"+s[i].getSupCity());
				
			}
		}
		public void getDetailsById(int id)
		{
			int f=0;
			System.out.println("Enter supplier id to fetch details");
			int y=sc.nextInt();
		
			for(int i=0;i<x;i++)
			{
				if(s[i].getSupId()==y)
				{
					System.out.println("Supplier id :"+s[i].getSupId());
					System.out.println("Supplier Name :"+s[i].getSupName());
					System.out.println("Supplier contactno:"+s[i].getContactno());
					System.out.println("Supplier city :"+s[i].getSupCity());
					

							}
				if(f==0)
					System.out.println("Enter valid id");
			}
		}
	

}

