package Lec32;

public class lexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexo(13, 0);

	}
	public static void lexo(int n,int c)
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
				lexo(n,c*10+i);
			}
		}
	}
	
	

}
