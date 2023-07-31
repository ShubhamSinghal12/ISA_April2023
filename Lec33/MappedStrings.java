package Lec33;

public class MappedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mps("123","");

	}
	public static void mps(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ltr = (char)(ques.charAt(0)-'1'+65);
			mps(ques.substring(1), ans+ltr);
			if(ques.length() >= 2)
			{
				int i = Integer.parseInt(ques.substring(0,2));
				if(i <= 26)
				{
					mps(ques.substring(2), ans+(char)(i+64));
				}
			}
		}
	}

}
