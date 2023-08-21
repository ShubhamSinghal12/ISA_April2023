package Lec40;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] arr = new Person[2];
		Person p = new Person();
		p.name = "Shubham";
		p.age = 27;
		System.out.println(p.name+" "+p.age);
		
		p.saysHello();
		
		Person p2 = new Person();
		p2.name = "Mayank";
		p2.age = 24;
		System.out.println(p2.name+" "+p2.age);
		
		p2.saysHello();
		
//		arr[0] = p;
//		arr[1] = p2;
//		
//		arr[0].saysHello();
		
		
	}
	
	
	
	

}
