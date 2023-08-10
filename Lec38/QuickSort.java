package Lec38;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,4,6,3,2,8,1,5};
//		partition(arr, 0, arr.length-1);
		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static int partition(int[] arr,int si,int ei)
	{
		int pivot = arr[ei];
		int j = si;
		for(int i = si; i <= ei; i++)
		{
			if(arr[i] <= pivot)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				j++;
			}
		}
		return j-1;
	}
	
	public static void quickSort(int[] arr,int si,int ei)
	{
		if(si >= ei)
		{
			return;
		}
		else
		{
			int pi = partition(arr, si, ei);
			quickSort(arr, si, pi-1);
			quickSort(arr, pi+1, ei);
		}
	}

}
