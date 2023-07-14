package Lec25;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[16];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr,13));
		
	}
	
	public static int binarySearch(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
