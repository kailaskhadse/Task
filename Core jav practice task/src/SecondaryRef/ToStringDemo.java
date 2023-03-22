package SecondaryRef;

public class ToStringDemo {
	int rollnum;
	String name;
	public ToStringDemo(int rollnum, String name) {
		super();
		this.rollnum = rollnum;
		this.name = name;}

		public String toString() {
		return "Student:" +"Rollnum:"+rollnum+","+"Name :"+name;
		}
	

	/*@Override
	public String toString() {
		return "rollnum=" + rollnum + ", name=" + name ;
	}*/
	public static void main(String[] args) {
		ToStringDemo d1=new ToStringDemo(1, "Kailas");
		ToStringDemo d2=new ToStringDemo(2, "Gattu");
		System.out.println(d1);
		System.out.println(d2);
	}
	}
