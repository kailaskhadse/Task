package jdbcPreparedStatement;

import java.util.Scanner;

public class Finalpd {
	public static void main(String[] args) throws Exception {
		Test1 t= new Test1();
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("Enter choise:\n 1.Create table \n 2.Insert value in table \n 3.view data \n 4.delete data \n 5.Exist");
		int choise=sc.nextInt();
		switch(choise) {
		case 1:t.addTable();
		break;
		case 2:t.insertData();
		break;
		case 3:t.viewData();
		break;
		case 4:t.deletData();
		break;
		case 5: System.exit(0);
		}
		
		}
		
		
	}
	
}


