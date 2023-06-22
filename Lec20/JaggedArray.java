package Lec20;

import java.util.Scanner;

public class JaggedArray {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int[4][];
//		
//		arr[0] = new int[4];
//		arr[1] = new int[2];
//		arr[2] = new int[5];
//		arr[3] = new int[3];
//		takeInput(arr);
		
		int[][] arr = {{1,2,3,4,5},{10,20,30},{1,2}};
//		arr[0] = new int[]{1,2,3,4,5};
//		arr[1] = new int[]{10,20,30};
//		arr[2] = new int[]{1,2};
		
		display(arr);
	}
	
	public static void takeInput(int[][] arr)
	{	
		for(int i= 0 ; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void display(int[][] arr)
	{	
		
//		for(int i= 0 ; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j]+" ");
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
