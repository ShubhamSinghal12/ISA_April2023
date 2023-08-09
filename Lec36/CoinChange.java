package Lec36;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5};
//		ccp(coins, 5, "");
		ccc(coins, 5, 0, "");

	}
	
	public static void ccp(int[] coins,int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n < 0)
		{
			return ;
		}
		else
		{
			for(int i = 0; i < coins.length; i++)
			{
				if(n >= coins[i])
				{
					ccp(coins, n-coins[i], ans+coins[i]+" ");
				}
			}
		}
	}
	
	
	public static void ccc(int[] coins,int n,int lp,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n < 0)
		{
			return ;
		}
		else
		{
			for(int i = lp; i < coins.length; i++)
			{
//				n = n-coins[i];
				ccc(coins, n-coins[i],i, ans+coins[i]+" ");
//				n = n+coins[i]; // Backtracking
			}
		}
	}

}
