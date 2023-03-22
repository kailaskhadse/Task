package SecondaryRef;

public class Person {
	/*String pname;
	int adharNum;
	long contact;
	Address add;
	public Person(String pname, int adharNum, long contact, Address add) {
		super();
		this.pname = pname;
		this.adharNum = adharNum;
		this.contact = contact;
		this.add = add;*/
	private	String pname;
	private	int adharNum;
	private	long contact;
	private	Address add;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(int adharNum) {
		this.adharNum = adharNum;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	

}
