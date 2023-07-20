package Lec29;

import java.util.ArrayList;
import java.util.Arrays;

public class AllOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,2,1,5,2,6,2,7};
//		ArrayList<Integer> ans = new ArrayList<>();
//		allO2(arr, 0, 2,ans);
//		System.out.println(ans);
		
		int[] ans = allO3(arr, 0, 2, 0);
		System.out.println(Arrays.toString(ans));

	}
	
	
	public static int[] allO3(int[] arr,int i,int ele,int count)
	{
		if(i == arr.length)
		{
			int[] ans = new int[count];
			return ans;
		}
		else
		{
			if(arr[i] == ele)
			{
				count++;
			}
			
			int[] ans = allO3(arr, i+1, ele,count);
			
			if(arr[i] == ele)
			{
				ans[count-1] = i;
			}
			return ans;
			
		}
	}
	
	public static void allO2(int[] arr,int i,int ele,ArrayList<Integer> ans)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
				ans.add(i);
			}
			
			allO2(arr, i+1, ele,ans);
			
		}
	}
	
	
	public static void allO(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
				System.out.println(i);
			}
			allO(arr, i+1, ele);
		}
	}
	

}
