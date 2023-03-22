package ComparableTask;

public class Product implements Comparable<Product>  {
private int pid;
private String pname;
private Double pprice;
@Override
public int compareTo(Product o) {
	// TODO Auto-generated method stub
	return o.pprice.compareTo(this.pprice);
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Double getPprice() {
	return pprice;
}
public void setPprice(Double pprice) {
	this.pprice = pprice;
}
}
