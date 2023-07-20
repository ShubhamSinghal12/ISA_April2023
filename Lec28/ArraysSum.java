package Lec28;

public class ArraysSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(sum(arr, 0));
	}
	
	public static int sum(int[] arr,int i)
	{
		if(i == arr.length-1)
		{
			return arr[arr.length-1];
		}
		else
		{
			return arr[i]+sum(arr,i+1);
		}
	}
	
}
