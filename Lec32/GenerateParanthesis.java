package Lec32;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gp(0, 0, 3,"");

	}
	
	public static void gp(int op,int clo,int n,String ans)
	{
		if(op == clo && clo == n)
		{
			System.out.println(ans);
		}
		else if(op > n || clo > op)
		{
			return;
		}
		else
		{
			gp(op+1, clo, n, ans+"(");
			gp(op, clo+1, n, ans+")");
		}
	}

}
