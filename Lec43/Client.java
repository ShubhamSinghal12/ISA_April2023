package Lec43;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DynamicStack st = new DynamicStack(5);
//		
//		for(int i = 1; i <= 15; i++)
//		{
//			st.push(i);
//			st.display();
//		}
		
		DynamicQueue qt = new DynamicQueue();
		for(int i = 1; i<= 15; i++)
		{
			qt.enqueue(i);
			qt.display();
		}
		
	}

}
