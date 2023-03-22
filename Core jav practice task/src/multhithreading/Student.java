package multhithreading;

public class Student implements Comparable<Student> {
private int rollnum;
private String name;
	public int getRollnum() {
	return rollnum;
}
public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.rollnum-this.rollnum;
	}
	
	

}
