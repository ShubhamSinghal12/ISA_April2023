package Lec31;

import java.util.ArrayList;

public class LetterCombination {

	public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lc("23", "");
		System.out.println(lc("796"));

	}
	public static void lc(String digits, String ans)
	{
		if(digits.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			int digit = digits.charAt(0) - '0';
			String st = map[digit];
			for(int i = 0; i < st.length(); i++)
			{
				lc(digits.substring(1), ans+st.charAt(i));
			}
			
		}
	}
	
	public static ArrayList<String> lc(String digits) {
        if (digits.length()==0) {
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        String[] digit = {"",    "",    "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for ( char d : digits.toCharArray()) {
            ArrayList<String> temp = new ArrayList<>();
            for ( String s : ans) {
                for (char c : digit[d - '0'].toCharArray()) {
                    temp.add(s + c);
                }
            }
            ans = temp;
        }
        return ans;
    }
	

}
