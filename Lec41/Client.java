package Lec41;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Stack st = new Stack();
//		
//		for(int i = 10; i <= 30; i+=10)
//		{
//			st.push(i);
//			st.display();
//		}
//		
//		System.out.println(st.pop());
//		st.push(4);
//		st.push(5);
//		st.display();
		
		
		
		Queue qt = new Queue();
		qt.enqueue(10);
		qt.enqueue(20);
		qt.enqueue(30);
		qt.display();
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
		qt.display();
		qt.enqueue(40);
		qt.enqueue(50);
		qt.enqueue(60);
		qt.display();
		
		
	}

}
