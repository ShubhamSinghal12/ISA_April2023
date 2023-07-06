package Lec24;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hellollo"; 
//		System.out.println(s);
//		System.out.println(s.charAt(1));
//		System.out.println(s.length());
//		System.out.println(s.substring(1,4));
//		System.out.println(s.substring(5));
//		
//		System.out.println(s.contains("el"));
//		String s1  = "He";
//		System.out.println(s.startsWith(s1));
//		System.out.println(s.endsWith("lo"));
//		
//		System.out.println(s.indexOf('l'));
//		System.out.println(s.lastIndexOf('l'));
//		
//		System.out.println(s.indexOf("ll"));
//		System.out.println(s.lastIndexOf("ll"));
//		
//		System.out.println(s.replace('l', 'r'));
//		System.out.println(s.replace("ll", ""));
//		
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
		
//		System.out.println(s.substring(2,3).toUpperCase());
		
		String s1 = "Hello";
		String s2 = "Hello123";
		String s3 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(s2.equals(s3));
		
		
//		s1 = s1.concat(s2);
		s1 = s1+s2;
		System.out.println(s1);
		
	}
	

}
