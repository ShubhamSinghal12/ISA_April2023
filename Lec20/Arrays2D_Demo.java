package Lec20;

import java.util.Scanner;

public class Arrays2D_Demo {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] arr = new int[3][];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		
//		arr[0] = new int[4];
//		
//		arr[0][2] = 100;
//		System.out.println(arr[0][2]);
//		System.out.println(arr[0]);
		
		
		int[][] arr = takeInput(3, 4);
		display(arr);
	}
	
	public static int[][] takeInput(int m,int n)
	{	
		int[][] arr = new int[m][n];
		for(int i= 0 ; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;	
	}
	
	
	public static void display(int[][] arr)
	{	
//		for(int i= 0 ; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[0].length; j++)
//			{
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		
		for(int[] row:arr)
		{
			for(int val : row)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
			
	}

}
