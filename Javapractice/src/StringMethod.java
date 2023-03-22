
public class StringMethod {
	public static void main(String[] args) {
		String s="      RAJESH";
		String s1="rkhkjk";
		String s3="rvrv";
		String s4="rvrv";
		String s5="RVRV";		
		System.out.println(s.concat(s1));
		System.out.println(s.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.isEmpty());
		System.out.println(s.charAt(11));
		System.out.println(s.indexOf('H'));
		System.out.println(s.length());
		System.out.println(s1.replace('k', 'm'));
		System.out.println(s3==s4);
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s3.equals(s5));
		
	}

}
