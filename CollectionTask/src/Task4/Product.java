package Task4;

import java.util.*;

public class Product {
	public static void main(String[] args) {
		List<Supplier> supList=new ArrayList<>();
		Supplier sup1=new Supplier();
		sup1.setSupId(1);
		sup1.setSupName("Raj");
		sup1.setSupCity("Pune");
		Supplier sup2=new Supplier();
		sup2.setSupId(2);
		sup2.setSupName("Ravi");
		sup2.setSupCity("Thane");
		supList.add(sup1);
		supList.add(sup2);
		Set<Supplier>supSet=new HashSet<>();
		Supplier sup4=new Supplier();
		sup4.setSupId(4);
		sup4.setSupName("Gana");
		sup4.setSupCity("risod");
		Supplier sup5=new Supplier();
		sup5.setSupId(5);
		sup5.setSupName("suraaj");
		sup5.setSupCity("buldana");
		Supplier sup6=new Supplier();
		sup6.setSupId(6);
		sup6.setSupName("umesh");
		sup6.setSupCity("amravti");
		supSet.add(sup4);
		supSet.add(sup5);
		supSet.add(sup6);
		Map<String, Collection<Supplier>> product=new HashMap<>();
		product.put("listsup",supList); 
		product.put("Setsupplier", supSet);
		/*Set<String> key1=product.keySet();
		for(String s:key1)
		{
			Collection<Supplier> m1=product.get(s);
			for(Supplier s1:m1) {
				System.out.println(s1.getSupName()+" "+ s1.getSupId()+" "+s1.getSupCity());
			}
		}*/
		
		product.forEach((k,v)->
		v.forEach((s)-> System.out.println(s.getSupName()+" "+ s.getSupId()+" "+s.getSupCity())))
		;
		
		
		
				
		
		
		
	}

}
