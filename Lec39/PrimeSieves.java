package Lec39;

public class PrimeSieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ps(100);

	}
	
	public static void ps(int n)
	{
		boolean[] ps = new boolean[n+1];
//		int rootn = (int)Math.sqrt(n);
		int rootn = n;
		for(int i = 2; i <= rootn; i++)
		{
			if(ps[i] == false)
			{
				System.out.println(i);
				for(int j = i; j*i <= n; j++)// (int j = i*i; j <= n; j+=i)
				{
					ps[i*j] = true;
				}
			}
		}
	}

}
