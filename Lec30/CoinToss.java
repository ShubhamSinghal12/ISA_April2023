package Lec30;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ct(3, "");

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
}
