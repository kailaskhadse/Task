package CollectionProject;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Karvenagar k=new Karvenagar();
		Scanner sc=new Scanner(System.in);
		while(true) {
System.out.println("Enter your choice:\n 1.Add course \n 2.View Course \n 3.Add faculty \n 4.View Faculty \n 5.Add Batch \n 6.view Batch \n 7. add student \n 8.view student");
	int choice=sc.nextInt();
	
		switch(choice) {
		case 1:k.addCourse();
		break;
		case 2 :k.viewCourse();
		break;
		case 3:k.addFaculty();
		break;
		case 4:k.viewFaculty();
		break;
		case 5:k.addBatch();
		break;
		case 6:k.viewBatch();
		break;
		case 7:k.addStudent();
		break;
		case 8:k.viewStudent();
		
		}
	}
	
	}

}
