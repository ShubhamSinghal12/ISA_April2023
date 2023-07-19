package Lec27;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));

	}
	
	public static int sum(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
		{
			int bp = sum(n-1)+n;
			return bp;
		}
	}

}
