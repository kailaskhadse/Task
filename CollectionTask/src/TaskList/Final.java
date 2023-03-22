package TaskList;

import java.util.*;

public class Final {

	public static void main(String[] args) {
		Set<Employee> eset= new HashSet<>();
		Employee e1= new Employee();
		e1.setEid(111);
		e1.setEname("Kailas");
		e1.setSalary(5000);
		Employee e2= new Employee();
		e2.setEid(112);
		e2.setEname("Kumar");
		e2.setSalary(6000);
		eset.add(e1);
		eset.add(e2);
		Set<Product>pset=new HashSet<>();
		Product p1=new Product();
		p1.setPid(1);
		p1.setPname("Pen");
		p1.setPrice(100.00);
		Product p2=new Product();
		p2.setPid(2);
		p2.setPname("Pencil ");
		p2.setPrice(200.00);
		pset.add(p1);
		pset.add(p2);
		Set<Object> company=new HashSet();
		company.add(pset);
		company.add(eset);
		Iterator<Object> it = company.iterator();
		while (it.hasNext()) {
		Set<Object> oo= (Set<Object>) it.next();
		Iterator<Object> it1 = oo.iterator();
		while (it1.hasNext()) {
			Object o=		it1.next();
			if (o instanceof Product) {
			Product pp=(Product)o;
			System.out.println("Product name:"+pp.getPname());
			System.out.println("Product id:"+pp.getPid());
			System.out.println("Product price:"+pp.getPrice());}
		if(o instanceof Employee) {
			Employee ss=(Employee)o;
			System.out.println("Employee name :"+ss.getEname());
			System.out.println("Employee id :"+ss.getEid());
			System.out.println("Employee salary :"+ss.getSalary());
		}
		
/*company.forEach((cm) ->{
	
	System.out.println(cm);
	
});*/



	}

		}
	}}
