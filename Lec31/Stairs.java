package Lec31;

public class Stairs {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(stairs(5, ""));
//		stairs2(5, "");
		
		System.out.println(stairs(new int[] {1,2,5}, 6, ""));

	}
	
	
	public static int stairs(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(n < 0)
		{
			return 0;
		}
		else
		{
			int ct = 0;
			ct += stairs(n-1, ans+"1");
			ct += stairs(n-2, ans+"2");
			return ct;
		}
	}
	
	
	public static void stairs2(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else
		{
			stairs2(n-1, ans+"1");
			if(n >= 2)
				stairs2(n-2, ans+"2");
		}
	}
	
	
	
	
	public static int stairs(int[] str,int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
//		else if(n < 0)
//		{
//			return 0;
//		}
		else
		{
			int ct = 0;
			for(int i = 0; i < str.length; i++)
			{
				if(n >= str[i])
				{
					ct += stairs(str, n-str[i], ans+str[i]);
				}
			}
			return ct;
		}
	}

}
