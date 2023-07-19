package Lec27;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));

	}
	
	public static int fib(int n)
	{
		if(n == 0|| n == 1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}

}
