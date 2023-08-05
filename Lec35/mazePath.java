package Lec35;

public class mazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 4;
		mazePath2(0, 0, m-1, n-1, "");
		
	}
	
	public static void mazePath(int cr,int cc,int m,int n,String ans)
	{
		if(cr == m && cc == n)
		{
			System.out.println(ans);
		}
		else if(cr > m || cc > n)
		{
			return;
		}
		else
		{
			mazePath(cr+1, cc, m, n, ans+"V");
			mazePath(cr, cc+1, m, n, ans+"H");
		}
	}
	
	public static void mazePath2(int cr,int cc,int m,int n,String ans)
	{
		if(cr == m && cc == n)
		{
			System.out.println(ans);
		}
		else if(cr > m || cc > n)
		{
			return;
		}
		else
		{
			mazePath2(cr+1, cc+1, m, n, ans+"D");
			mazePath2(cr+1, cc, m, n, ans+"V");
			mazePath2(cr, cc+1, m, n, ans+"H");
		}
	}
}
