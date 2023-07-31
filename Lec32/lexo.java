package Lec32;

public class lexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lexo1(13, 0);
		for(int i = 1; i<= 9; i++)
			lexo2(1000,i);

	}
	public static void lexo1(int n,int c)
	{
		if(c > n)
		{
			return;
		}
		else
		{
			int i = 0;
			if(c == 0)
				i = 1;
			else
				System.out.println(c);
			for(; i <= 9; i++)
			{
				lexo1(n,c*10+i);
			}
		}
	}
	
	public static void lexo2(int n,int c)
	{
		if(c > n)
		{
			return;
		}
		else
		{
			System.out.println(c);
			for(int i = 0; i <= 9; i++)
			{
				lexo2(n,c*10+i);
			}
		}
	}
	
	

}
