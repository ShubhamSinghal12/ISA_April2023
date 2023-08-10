package Lec38;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,7,8};
		int[] brr = {2,5,6,9,10};
		
		System.out.println(Arrays.toString(merge(arr, brr)));

	}
	
	public static int[] merge(int[] arr,int[] brr)
	{
		int[] ans = new int[arr.length+brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr.length && j < brr.length)
		{
			if(arr[i] < brr[j])
			{
				ans[k] = arr[i];
				i++;
				k++;
			}
			else
			{
				ans[k] = brr[j];
				j++;
				k++;
			}
		}
		
		while(i < arr.length)
		{
			ans[k] = arr[i];
			i++;
			k++;
		}
		
		while(j < brr.length)
		{
			ans[k] = brr[j];
			j++;
			k++;
		}
		return ans;
	}
	
	public static int[] mergeSort(int[] arr,int si,int ei)
	{
		if(si == ei)
		{
			return new int[] {arr[si]};
		}
		else
		{
			int mid = (si+ei)/2;
			int[] left = mergeSort(arr, si, mid);
			int[] right = mergeSort(arr, mid+1, ei);
			return merge(left,right);
		}
	}

}
