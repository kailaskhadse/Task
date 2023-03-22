package com.client;

import java.util.Scanner;

import com.service.College;
import com.serviceimpl.Kailas;

public class Test {

	public static void main(String[] args) {
		College c= new Kailas();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choise \n 1.addCourse \n 2.view course \n 3.add faculty \n 4.view faculty \n 5.add Batch \n 6.view Batch \n 7.add student \n 8.view Student \n 9.Exist");
             int choise=sc.nextInt();
             switch(choise) {
             case 1:c.addCourse();
             break;
             case 2:c.viewCourse();
             break;
             case 3:c.addFaculty();
             break;
             case 4:c.viewFaculty();
             break;
             case 5:c.addBatch();
             break;
             case 6:c.viewBatch();
             break;
             case 7:c.addStudent();
             break;
             case 8:c.viewStudent();
             break;
             }
	}

}
}