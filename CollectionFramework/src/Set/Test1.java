package Set;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Set<Integer> a= new HashSet<>();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer> b= new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,8,9,0}));
		//to find union
		Set<Integer>union=new HashSet<>(a);
		union.addAll(b);
		System.out.println("union of two set"+ union);
		//to find intersection
		Set<Integer>inter=new HashSet<>(b);
		inter.retainAll(b);
		System.out.println("Intersection of"+inter);
		//to find symmetric difference
		Set<Integer> diff=new HashSet<>(b);
		diff.removeAll(a);
		System.out.println("Differnece bet two sets"+diff);
		

	}

}
