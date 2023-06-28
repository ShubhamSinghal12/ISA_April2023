package Lec21;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(arr);
		display(arr);

	}
	
	public static void transpose(int[][] arr)
	{
		//lower Triangular
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0 ; j < i; j++)
			{
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
		
		//Upper Triangular
//		for(int i = 0; i < arr.length-1; i++)
//		{
//			for(int j = i+1 ; j < arr[0].length; j++)
//			{
//				int t = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = t;
//			}
//		}
	}
	
	public static void display(int[][] arr)
	{	
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
