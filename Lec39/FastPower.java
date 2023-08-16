package Lec39;

public class FastPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fp(2,10));
	}
	
	
	public static int fp(int a,int b)
	{
		if(b == 1)
		{
			return a;
		}
		else
		{
			int ans = fp(a,b/2);
			if(b%2 == 0)
			{
				return ans*ans;
			}
			else
			{
				return ans*ans*a;
			}
		}
	}

}
