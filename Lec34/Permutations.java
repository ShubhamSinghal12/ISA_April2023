package Lec34;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tp("abb","");

	}
	public static void p1(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i <= ans.length(); i++)
			{
				String na = ans.substring(0,i)+ques.charAt(0)+ans.substring(i);
				p1(ques.substring(1), na);
			}
		}
	}
	
	public static void p2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0;i < ques.length(); i++)
			{
				String nq = ques.substring(0,i)+ques.substring(i+1);
				p2(nq,ans+ques.charAt(i));
			}
		}
	}
	
	public static void tp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0;i < ques.length(); i++)
			{
				if(ques.indexOf(ques.charAt(i)) == i)
				{
					String nq = ques.substring(0,i)+ques.substring(i+1);
					tp(nq,ans+ques.charAt(i));
				}
			}
		}
	}
}
