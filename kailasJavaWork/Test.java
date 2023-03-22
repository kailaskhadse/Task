
import java.util.Scanner;

import kailasJavaWork.Employees;
public class Test
{
  Employees e []=new Employees[100];
  int x;
 
  Scanner sc= new Scanner(System.in);
  public void addEmployee()
  {
	  System.out.println("Enter num of employees to add");
	  this.x=sc.nextInt();
	  for(int i=0;i<x;i++)
	  {
		  Employees emp = new Employees();
		  System.out.println("Enter empid:");
		  emp.setEmpId(sc.nextInt());
		  System.out.println("Enter empname:");
		  emp.setEmpName(sc.next());
		  System.out.println("Enter city:");
		  emp.setCity(sc.next());
		  System.out.println("Enter empSalary:");
		  emp.setEmpsalary(sc.nextDouble());
		  e[i]=emp;
	  }
  }
  public void viewEmployee()
  {
	  for(int i=0;i<x;i++)
	  {
		  System.out.println("Emp id:"+e[i].getEmpId());
		  System.out.println("Emp name:"+e[i].getEmpName());
		  System.out.println("Emp city:"+e[i].getCity());
		  System.out.println("Emp Salary:"+e[i].getEmpsalary());
	  }
  }
  public void findEmployee()
  {
	  int f=0;
	  System.out.println("Enter empId to fetch deatails of employee");
	  int y=sc.nextInt();
	  for (int i=0;i<x;i++)
	  {
		  if (e[i].getEmpId()==y)
		  { 
	        System.out.println("Emp id:"+e[i].getEmpId());
		  System.out.println("Emp name:"+e[i].getEmpName());
		  System.out.println("Emp city:"+e[i].getCity());
		  System.out.println("Emp Salary:"+e[i].getEmpsalary());
		  
		 
		  }
	  }
	  if(f==0)
	  {
		  System.out.println("Enter valid empid");
	  }
  }
  public void updateName()
  {
	  int f=0;
	  System.out.println("Enter empId to update employee name ");
	  int y=sc.nextInt();
	  for (int i=0;i<x;i++)
	  {
		  if (e[i].getEmpId()==y)
		  {  
	        System.out.println("Enter name to update");
			e[i].setEmpName(sc.next());
		   f=1;
	  }
  }
  if(f==0)
  {
	  System.out.println("Enter correct id");
  }
}
   public void city()
   {
	   System.out.println(" enter city to find employee");
	   String y=sc.next();
	   int f=0;
	   for (int i=0;i<x;i++)
	  {
		  if (e[i].getCity().equals(y))
		  {  
	         System.out.println("Emp id:"+e[i].getEmpId());
		  System.out.println("Emp name:"+e[i].getEmpName());
		  System.out.println("Emp city:"+e[i].getCity());
		  System.out.println("Emp Salary:"+e[i].getEmpsalary());
	        f=1;
		   
	  }
  }
  if(f==0)
  {
	  System.out.println("Enter correct city");
   }
   }
  public void samename()
  {
	  System.out.println(" enter name to find  same name employee");
	   String y=sc.next();
	   int f=0;
	   for (int i=0;i<x;i++)
	  {
		  if (e[i].getEmpName().equals(y))
		  {  
	         System.out.println("Emp id:"+e[i].getEmpId());
		  System.out.println("Emp name:"+e[i].getEmpName());
		  System.out.println("Emp city:"+e[i].getCity());
		  System.out.println("Emp Salary:"+e[i].getEmpsalary());
	        
		  
	  }
	  }
  if(f==0)
  {
	  System.out.println("Enter correct name");
   }
   }
   public void name()
   {
	   
   System.out.println(" enter name to find employee");
	   String y=sc.next();
	   int f=0;
	   for (int i=0;i<x;i++)
	  {
		  if (e[i].getEmpName().equals(y))
		  {  
	         System.out.println("Emp id:"+e[i].getEmpId());
		  System.out.println("Emp name:"+e[i].getEmpName());
		  System.out.println("Emp city:"+e[i].getCity());
		  System.out.println("Emp Salary:"+e[i].getEmpsalary());
	        f=1;
		  
	  }
  }
  if(f==0)
  {
	  System.out.println("Enter correct name");
   }
   }
   public void bellowSalary()
   {
	   System.out.println("Enter salary");
	   double y=sc.nextDouble();
	   int f=0;
	   for (int i=0;i<x; i++)
	   { 
        if(e[i].getEmpsalary()< y)
		{
			 System.out.println("Emp id:"+e[i].getEmpId());
		  System.out.println("Emp name:"+e[i].getEmpName());
		  System.out.println("Emp city:"+e[i].getCity());
		  System.out.println("Emp Salary:"+e[i].getEmpsalary());
	        
		  f=1;
	  }
  }
  if(f==0)
  {
	  System.out.println("Enter correct salary");
   }
   }
			
   
   
  public static void main (String args[])
  {
	   Test t = new Test();
	  Scanner sc = new Scanner(System.in);
	  while(true)
	  {
	  System.out.println("Enter choise \n 1.add employees \n 2.view Employee \n 3.find Employee by id \n 4.update name \n 5.same city name employees \n 6.same name empoyees \n 7.find emplyee by name \n 8.emplyee bellow entered salary \n 9.Exit");
	  int choise =sc.nextInt();
	  switch (choise)
	  {
	  case 1: t.addEmployee();
	   break;
	  case 2: t.viewEmployee();
	   break;
	   case 3: t.findEmployee();
	   break;
	   case 4: t.updateName();
	   break;
	   case 5:t.city();
	   break;
	   case 6:t.samename();
	   break;
	   case 7 :t.name();
	   break;
	   case 8: t.bellowSalary();
       break ;	   
	   case 9: System.exit(0);
	  }
	  }
  }

}
   	  
	  
  
  


