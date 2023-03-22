package CoamparatorTask;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee1> m=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice : \n 1.employee Id sort \n 2.employee name sort\n 3.employee salary sort");
		int choice=sc.nextInt();
		if(choice==1) {
			Comparator<Employee1> cid =(o1,o2)-> o1.getEmpId()-o2.getEmpId();
			m=new TreeSet(cid);
			
		}
		else if(choice==2) {
			Comparator<Employee1> cnm =(o1,o2)-> o1.getEmpName().compareTo(o2.getEmpName());
			m=new TreeSet(cnm);
		}
		else if(choice==3) {
			Comparator<Employee1> csal =(o1,o2)->(int)(o1.getEmpSalary()-o2.getEmpSalary());
			m=new TreeSet(csal);
		}
		Employee1 emp1=new Employee1();
		emp1.setEmpId(333);
		emp1.setEmpName("BBB");
		emp1.setEmpSalary(300.00);
		Employee1 emp2=new Employee1();
		emp2.setEmpId(111);
		emp2.setEmpName("CCC");
		emp2.setEmpSalary(200.00);
		Employee1 emp3=new Employee1();
		emp3.setEmpId(222);
		emp3.setEmpName("AAA");
		emp3.setEmpSalary(100.00);
		m.add(emp1);
		m.add(emp2);
		m.add(emp3);
		m.forEach((em)->{System.out.println("id :"+em.getEmpId());
		System.out.println("name :"+em.getEmpName());
		System.out.println("Salary :"+em.getEmpSalary());
		});


	}

}
