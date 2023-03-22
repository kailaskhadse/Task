package MapTask;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
    Map<Integer,String>map4=new HashMap<>();
   map4.put(1,"A");
   map4.put(2,"B");
   map4.put(3,"C");
   Map<Integer,String>map5=new HashMap<>();
   map5.put(1,"X");
   map5.put(2,"Y");
   map5.put(3,"Z");
   Map<Integer,Map<Integer,String>> map2=new HashMap<>();
   map2.put(1, map4);
   Map<Integer,Map<Integer,String>> map3=new HashMap<>();
   map3.put(1, map5);
   Map<Integer,Map<Integer,Map<Integer,String>>> map1=new HashMap<>();
   map1.put(1, map2);
   map1.put(2, map3);
   Set <Integer> keys1=map1.keySet();
   Iterator<Integer> itr1=keys1.iterator();
   while(itr1.hasNext()) {
	   Integer x=itr1.next();
	   Map<Integer,Map<Integer,String>>m =map1.get(x);
   }
 /*  for(Integer i1:keys1)
   {
Map<Integer,Map<Integer,String>> m1=map1.get(i1); 
   Set<Integer> keys2=m1.keySet();
   
  for(Integer i2:keys2)
    { 
    	Map<Integer,String> m2=m1.get(i2);
    	Set<Integer>keys3=m2.keySet();
    for(Integer i3:keys3)
    {
    	String m3=m2.get(i3);
    	System.out.println(m3);
    }
    }
    
   }*/
   
  /* map1.forEach((k,v)->
   (v).forEach((k1,v1)->
   (v1).forEach((k2,v2)->System.out.println((v2)))));*/
   
   
   
   
	}

}
