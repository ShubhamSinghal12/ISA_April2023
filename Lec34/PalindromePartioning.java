package Lec34;

public class PalindromePartioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pp("nitinn", "");

	}
	
	public static boolean isPalindrome(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		while(si < ei)
		{
			if(st.charAt(si) != st.charAt(ei))
			{
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}
	
	public static void pp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				String ns = ques.substring(0,i+1);
				if(isPalindrome(ns))
				{
					pp(ques.substring(i+1), ans+ns+" ");
				}
			}
		}
	}

}
