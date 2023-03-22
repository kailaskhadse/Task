package Inheritance;

public class Run {
	public Employee empData()
	{
		Employee e= new Employee();
		e.setEmpId(1);
		e.setEmpEmail("raj@gamil.com");
		e.setPersonId(11);
		e.setPersonName("raj");
		return e;
		
	}
	public Person managerData() {
		Manager m= new Manager();
		m.setManagerId(11);
		m.setManagerEmail("k.gmail.com");
		m.setPersonId(12);
		m.setPersonName("kailas");
		return m;
		
	}
	public static void main(String[] args) {
		Run t=new Run();
		Employee emp=t.empData();
		System.out.println(emp.getPersonId());
		System.out.println(emp.getPersonName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpEmail());
		Manager man=(Manager)t.managerData();
		System.out.println(man.getManagerId());
		System.out.println(man.getManagerEmail());
		System.out.println(man.getPersonId());
		System.out.println(emp.getPersonName());
	}

}
