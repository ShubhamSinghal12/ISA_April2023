package Lec24;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		subString("Hello");
		palindromicSubString("nitinn");
	}
	
	public static void subString(String st)
	{
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i; j < st.length(); j++)
			{
				System.out.println(st.substring(i,j+1));
			}
		}
	}
	
	public static void palindromicSubString(String st)
	{
		for(int i = 0; i < st.length(); i++)
		{
			for(int j = i; j < st.length(); j++)
			{
				if(isPalindrome(st.substring(i,j+1)))
				{
					System.out.println(st.substring(i,j+1));
				}
			}
		}
	}
	
	public static boolean isPalindrome(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		while(si < ei)
		{
			if(st.charAt(ei) != st.charAt(si))
			{
				return false;
			}
			else
			{
				si++;
				ei--;
			}
		}
		return true;
	}
	
	
	
	
}
