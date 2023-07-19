package Lec27;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(5));
		int a = 10;
		System.out.println(++a + 10 + a++ + ++a + 10);
		
	}
	
	public static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	
	public static int factTail(int n,int ans)
	{
		if(n == 0)
		{
			return ans;
		}
		else
		{
			return factTail(n-1, ans*n);
		}
	}
	
}
