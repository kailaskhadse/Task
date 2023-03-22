package taskJdbc_callableStatement;

import java.util.Scanner;

public class FinalProject {
	Test t=new Test();
	
	Scanner sc= new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Test t=new Test();
		
		Scanner sc= new Scanner(System.in);

			while(true) {
		
			System.out.println("Enter your choise :\n 1.Insert data \n 2.view data \n 3.update data \n 4.delete data \n 5.Exist data");
		int choise =sc.nextInt();
		switch(choise) {
		case 1:t.insertData();
		break;
		case 2:t.viewData();
		break;
		case 3:t.updateData();
		break;
		case 4:t.deleteData();
		break;
		case 5:System.exit(0);
		
		
		}
		

	}

	}
}