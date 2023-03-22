package Inteface.Task3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
		boolean f=true;
		while(true)
		{
			System.out.println("Enter your choise \n 1.Product \n 2. Supplier\n 3. Dealer \n 4.Exist");
			int z= sc.nextInt();
			switch(z) {
			case 1: ProductDetails p2= new ProductDetails();
			
			while(f)
			{
				System.out.println("Enter your choise \n 1.Add new Entry \n 2. view  all data \n 3. Check data by id");
				int choise=sc.nextInt();
				switch(choise)
				{
				case 1: p2.addDetails();
				break;
				case 2: p2.getDetails();
				break;
				case 3: p2.getDetailsByid(sc.nextInt());
				break;
				case 4:f=false;
				default:System.out.println("Invalid entry");
				
				}}
				break;
			
   case 2: SupplierDetails s2= new SupplierDetails();
			
			while(f)
			{
				System.out.println("Enter your choise \n 1.Add new Entry \n 2. view  all data \n 3. Check data by id");
				int choise=sc.nextInt();
				switch(choise)
				{
				case 1: s2.addDetails();
				break;
				case 2: s2.getDetails();
				break;
				case 3: s2.getDetailsById(sc.nextInt());
				break;
				case 4:f=false;
				default:System.out.println("Invalid entry");
				}
			}
				break;
			
   case 3: DealerDetails d2= new DealerDetails();
	
	while(f)
	{
		System.out.println("Enter your choise \n 1.Add new Entry \n 2. view  all data \n 3. Check data by id");
		int choise=sc.nextInt();
		switch(choise)
		{
		case 1: d2.addDetails();
		break;
		case 2: d2.getDetails();
		break;
		case 3: d2.getDetailsByid(sc.nextInt());
		break;
		case 4:
			f=false;
		default:System.out.println("Invalid entry");
		}}
		break;
	
	
   case 4: System.exit(0);
   default:System.out.println("invalid entry");
   
			
			
	
			}
		}

	}
}


