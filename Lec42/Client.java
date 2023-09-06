package Lec42;

public class Client {
	
	public static void main(String[] args) {
		
		// Case 1
//		Child ch = new Child();
		
//		ch.saysHello();
//		ch.saysHello();
//		System.out.println(ch.x);
//		System.out.println(ch.y);
//		System.out.println(((Parent)ch).d);
		
		//Case 2
//		Parent p = new Parent();
//		p.saysHello();
//		System.out.println(p.x);
//		System.out.println(p.y);
//		System.out.println(p.d);
		
		//Case 3 (Polymorphism)
		
//		Parent p = new Child();
//		p.saysHello();
//		System.out.println(p.x);
//		System.out.println(((Child)p).y);
//		System.out.println(p.d);
//		((Child)p).saysHello1();
		
		//Case 4 (Wrong)
//		Child ch = new Parent();
		
		Child ch = new Child();
		System.out.println(ch);
		
	}

}
