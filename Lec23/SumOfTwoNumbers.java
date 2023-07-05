package Lec23;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,4,3,6};
		int[] brr = {9,9,7,8,2};
		
		System.out.println(sum(arr, brr));
		
	}
	
	public static ArrayList<Integer> sum(int[] arr,int[] brr)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		int c = 0;
		int i = arr.length-1;
		int j = brr.length-1;
		
		while(i >= 0 || j >=0)
		{
			int sum = c;
			if(i >= 0)
			{
				sum += arr[i];
				i--;
			}
			if( j >= 0)
			{
				sum += brr[j];
				j--;
			}
			
			ans.add(0,sum%10);
			c = sum/10;
		}
		
		if(c == 1)
			ans.add(0,1);
		
//		Collections.reverse(ans);
		return ans;
	}
}
