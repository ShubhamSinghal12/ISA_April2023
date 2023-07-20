package Lec28;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,2,1,5,2,6,2,7};
		allO(arr, 0, 2);
		
	}
	public static int as(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return -1;
		}
		else
		{
			if(arr[i] == ele)
			{
				return i;
			}
			else
			{
				return as(arr, i+1, ele);
			}
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
	
	
	public static int lo(int[] arr,int i,int ele,int ans)
	{
		if(i == arr.length)
		{
			return ans;
		}
		else
		{
			if(arr[i] == ele)
			{
				ans = i;
				return lo(arr, i+1, ele, ans);
			}
			else
			{
				return lo(arr, i+1, ele, ans);
			}
		}
	}

}
