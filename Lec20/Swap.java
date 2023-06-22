package Lec20;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int[] brr = {5,4,3,2,1};
		
		System.out.println(arr[0]+" "+brr[0]);
		swap3(arr,brr);
		System.out.println(arr[0]+" "+brr[0]);

	}
	
	public static void swap2(int[] arr,int[] brr, int id)
	{
		int t = arr[id];
		arr[id] = brr[id];
		brr[id] = t;
	}
	
	public static void swap(int a,int b)
	{
		int t = a;
		a = b;
		b = t;
	}
	
	public static void swap2(int a,int b,int[] arr)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void swap3(int[] arr,int[]brr)
	{
		int[] t = arr;
		arr = brr;
		brr = t;
	}
	

}
