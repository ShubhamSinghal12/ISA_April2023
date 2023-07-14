package Lec25;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Hello";
		StringBuilder sb = new StringBuilder(st);
		System.out.println(sb);
		
		sb.append("123");
		sb.insert(2, false);
		System.out.println(sb);
		
		sb.setCharAt(2, 'T');
		System.out.println(sb);
		
//		sb.replace(0,4,"T");
		sb.delete(0,0);
		sb.deleteCharAt(0);
//		System.out.println(sb);
		
		String ns = sb.toString();
		System.out.println(ns);

	}

}
