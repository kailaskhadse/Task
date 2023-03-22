package CoamparatorTask;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.empSalary-o.empSalary);
		//return this.empId-o.empId;
	}

}
