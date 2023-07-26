package Lec30;

public class CoinToss {

	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ct(3, "");
		System.out.println(cct(3,""));

	}
	
	public static void ct(int coins,String ans)
	{
		if(coins == 0)
		{
			System.out.println(ans);
		}
		else
		{
			ct(coins-1, ans+"H");
			ct(coins-1, ans+"T");
		}
	}
	
	
	public static int cct(int coins,String ans)
	{
		if(coins == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			count += cct(coins-1, ans+"H");
			count += cct(coins-1, ans+"T");
			return count;
		}
	}
	
	
	
}
