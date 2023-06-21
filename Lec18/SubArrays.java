package Lec18;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,3,4,-5,15,-20,8,3};
//		int[] arr = {-1,-2,-3,-4};
//		printSubArray(arr, 2, 5);
//		printAllSumSubArrays2(arr);
//		maxSumSubArrays(arr);
		System.out.println(kadanes(arr));

	}
	
	public static void printSubArray(int[] arr,int si,int ei)
	{
		for(int i = si; i <= ei; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void printAllSubArrays(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{

				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void printAllSumSubArrays(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int sum = 0;
				for(int k = i; k <= j; k++)
				{
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	
	public static void printAllSumSubArrays2(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}
	
	public static void maxSumSubArrays(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				max = Math.max(max, sum);
			}
		}
		System.out.println("Max: "+max);
	}
	
	public static int kadanes(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0 ;i < arr.length; i++)
		{
			sum += arr[i];
			
			max = Math.max(max, sum);
//			if(sum > max)
//				max = sum;
			
			if(sum < 0 )
			{
				sum = 0;
			}
		}
		return max;
	}
	
	
	public static int minSumSubArray(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0 ;i < arr.length; i++)
		{
			sum += arr[i];
			
			min = Math.min(min, sum);
			
			if(sum > 0 )
			{
				sum = 0;
			}
		}
		return min;
	}
	
	public static int circularSum(int[] arr)
	{
		int tsum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			tsum += arr[i];
		}
		int minS = minSumSubArray(arr);
		int ans = tsum - minS;
		
		return Math.max(ans, kadanes(arr));
	}
	

}
