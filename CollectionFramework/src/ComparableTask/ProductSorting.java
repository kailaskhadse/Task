package ComparableTask;

import java.util.*;

public class ProductSorting {

	public static void main(String[] args) {
		Set<Product> plist=new TreeSet<>();
		Product p1=new Product();
		p1.setPid(222);
		p1.setPname("Vivo1");
		p1.setPprice(12000.00);
		Product p2=new Product();
		p2.setPid(111);
		p2.setPname("Vivo");
		p2.setPprice(15000.00);
		Product p3=new Product();
		p3.setPid(333);
		p3.setPname("Vivo2");
		p3.setPprice(16000.00);

   plist.add(p1);
   plist.add(p2);
   plist.add(p3);
   plist.forEach((pr) ->{System.out.println("product name :"+pr.getPname());
   System.out.println("product id :"+pr.getPid());
   System.out.println("product price :"+pr.getPprice());
	});

}
}