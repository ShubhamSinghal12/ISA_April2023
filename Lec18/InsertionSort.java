package Lec18;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5,2,3,5,6,3,7,2,3,4};
//		insert(arr, 4);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insert(int[] arr,int i)
	{
		int temp = arr[i];
		i--;
		while(i >= 0)
		{
			if(arr[i] > temp)
			{
				arr[i+1] = arr[i];
				i--;
			}
			else
			{
				break;
			}
		}
		arr[i+1] = temp;
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			insert(arr, i);
		}
	}

}
