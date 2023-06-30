package Lec22;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 128;
		
		Integer a1 = i;//Auto Boxing
		Integer a2 = Integer.valueOf(i); //Boxing
		
		System.out.println(a1==a2);
		
		int i1 = a1;// Auto UnBoxing
		int i2 = a1.intValue(); // UnBoxing

	}

}
