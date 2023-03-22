package CoamparatorTask;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee>e=new TreeSet<>();
		Employee emp1=new Employee();
		emp1.setEmpId(333);
		emp1.setEmpName("BBB");
		emp1.setEmpSalary(300);
		Employee emp2=new Employee();
		emp2.setEmpId(111);
		emp2.setEmpName("CCC");
		emp2.setEmpSalary(200);
		Employee emp3=new Employee();
		emp3.setEmpId(222);
		emp3.setEmpName("AAA");
		emp3.setEmpSalary(100);
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		e.forEach((emp)->{System.out.println("id :"+emp.getEmpId());
		System.out.println("name :"+emp.getEmpName());
		System.out.println("Salary :"+emp.getEmpSalary());
		});

	}

}
