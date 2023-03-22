package Maptask;

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
	Set<String>mh=new HashSet<>();
	mh.add("Mumbai");
	mh.add("Pune");
	mh.add("Nagpur");
	Set<String>jr=new HashSet<>();
	jr.add("Ranchi");
	jr.add("Jd");
	Set<Set<String>> India=new HashSet<>();
	India.add(mh);
	India.add(jr);
	for(Set<String> s:India) {
	for(String city: s) {
		System.out.println(city);
	}
	}

	}

}
