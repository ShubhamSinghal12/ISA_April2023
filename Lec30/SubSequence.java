package Lec30;

import java.util.ArrayList;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(ss("abc"));
		ss2("abc","");

	}
	
	public static ArrayList<String> ss(String ques)
	{
		if(ques.length() == 0)
		{
			ArrayList<String> ans = new ArrayList<String>();
			ans.add("");
			return ans;
		}
		else
		{
			char ch = ques.charAt(0);
			ArrayList<String> rr = ss(ques.substring(1));
			ArrayList<String> ans = new ArrayList<>();
			for(String st: rr)
			{
				ans.add(ch+st);
				ans.add(st);
			}
			return ans;
		}
	}
	
	public static void ss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			ss2(ques.substring(1), ans+ques.charAt(0));
			ss2(ques.substring(1),ans);
		}
	}
	

}
