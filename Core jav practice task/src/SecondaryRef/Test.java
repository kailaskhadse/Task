package SecondaryRef;

public class Test {

	public static void main(String[] args) {
		/*Address a= new Address("karve nagar","Pune" ,44455);
		Person p =new Person("Kailas", 14555, 999985544L, a);
		System.out.println("person name :"+p.pname);
		System.out.println("person adharnum :"+p.adharNum);
		System.out.println("person mobile :"+p.contact);
		System.out.println("person areaname :"+p.add.areaname);
		System.out.println("person City :"+p.add.city);
		System.out.println("person Pincode :"+p.add.pincode);*/
		
		Address a = new Address();
		a.setAreaname("karve nagar");
		a.setCity("Pune");
		a.setPincode(45552);
		Person p = new Person();
		p.setPname("kailas");
		p.setAdharNum(645787984);
		p.setContact(987845555l);
		p.setAdd(a);
		System.out.println("Person detailas :"+p.getPname()+" "+p.getAdharNum()+" "+p.getContact());
		System.out.println("Address :"+p.getAdd().getAreaname()+" "+p.getAdd().getCity()+" "+p.getAdd().getPincode());
	}

}
