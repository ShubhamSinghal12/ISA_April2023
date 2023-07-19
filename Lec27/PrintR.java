package Lec27;

public class PrintR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pdi(5);
		pd2(4,10);
		
	}
	
	public static void pd(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			pd(n-1);
		}
	}
	
	
	public static void pi(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			pi(n-1);
			System.out.println(n);
		}
	}
	
	public static void pdi(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			pdi(n-1);
			System.out.println(n);
		}
	}
	
	public static void pd2(int i,int n)
	{
		if(i == n)
		{
			System.out.println(i);
		}
		else
		{
			pd2(i+1,n);
			System.out.println(i);
		}
	}
	

}
