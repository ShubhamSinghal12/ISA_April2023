package Lec34;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePermu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {
	    public List<List<Integer>> permute(int[] nums) {
					
					ArrayList<List<Integer>> bigAns = new ArrayList<>();
	        p1(nums,0,new ArrayList<Integer>(),bigAns);
					return bigAns;
	    }

		public static void p1(int[] ques,int i,ArrayList<Integer> ans,ArrayList<List<Integer>> bigAns)
		{
			if(ques.length == i)
			{
					bigAns.add(new ArrayList<Integer>(ans));
			}
			else
			{
				for(int j = 0; j <= ans.size(); j++)
				{
					ans.add(j,ques[i]);
					p1(ques,i+1,ans,bigAns);
					ans.remove(j);
				}
			}
		}
	  
	}

}
