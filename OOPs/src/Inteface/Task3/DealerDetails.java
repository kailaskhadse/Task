package Inteface.Task3;

import java.util.Scanner;

public class DealerDetails implements Services {
	Scanner sc= new Scanner(System.in);
	Dealer d[]= new Dealer[5];
	int x;
	public void addDetails()
	{
		System.out.println("Enter no add to dealer");
		this.x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			Dealer d1= new Dealer();
			System.out.println("Enter dealer Id");
			d1.setDealerId(sc.nextInt());
			System.out.println("Enter dealer Name");
			d1.setDealerName(sc.next());
			System.out.println("Enter dealer contact");
			d1.setDealercontactno(sc.nextLong());
			System.out.println("Enter dealer city");
			d1.setDealerCity(sc.next());
	
	   d[i]=d1;
	
		}}
		public void getDetails()
		{
			for(int i=0;i<x;i++)
			{
				System.out.println("Dealer id :"+d[i].getDealerId());
				System.out.println("Dealer Name :"+d[i].getDealerName());
				System.out.println("Dealer contactno:"+d[i].getDealercontactno());
				System.out.println("Dealer city :"+d[i].getDealerCity());
				
			}
		}
		public void getDetailsByid(int id)
		{
			int f=0;
			System.out.println("Enter dealer id to fetch details");
			int y=sc.nextInt();
		
			for(int i=0;i<x;i++)
			{
				if(d[i].getDealerId()==y)
				{
					System.out.println("Dealer id :"+d[i].getDealerId());
					System.out.println("Dealer Name :"+d[i].getDealerName());
					System.out.println("Dealer contactno:"+d[i].getDealercontactno());
					System.out.println("Dealer city :"+d[i].getDealerCity());
					

							}
				if(f==0)
					System.out.println("Enter valid id");
			}
		}
	

}
