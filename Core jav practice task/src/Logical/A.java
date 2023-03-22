package Logical;

public class A {

	public static void main(String[] args) {
		String s= "ramayanmahabharat";
		int count=0;
		char ch='a';
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
			
		}
		System.out.println(s.length());
		System.out.println(count);
	}

}
