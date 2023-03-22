package kailasJavaWork;

public class TestGetSet {

	GetSetMethod g=new GetSetMethod();
	public void setData()
	{
		
		g.setName("Kailas");
		g.setRollnum(1);
		g.setCity("Pune");
		g.setMobilenum(8975065870L);
		System.out.println(g.getName());
		System.out.println(g.getCity());
	}
		
		
public static void main(String[] args) {
		TestGetSet t = new TestGetSet();
		t.setData();
     
	
	}

}
