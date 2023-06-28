package Lec21;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		spiralPrint(arr);

	}
	
	public static void spiralPrint(int[][] arr)
	{
		int minr = 0;
		int maxr = arr.length-1;
		int minc = 0;
		int maxc = arr[0].length-1;
		
		int te = arr.length*arr[0].length;
		int ct = 0;
		
		while(ct < te)
		{
			for(int j = minc; j <= maxc&& ct < te; j++)
			{
				System.out.print(arr[minr][j]+" ");
				ct++;
			}
			minr++;
			
			for(int i = minr; i <= maxr && ct < te; i++)
			{
				System.out.print(arr[i][maxc]+" ");
				ct++;
			}
			maxc--;
			
			for(int j = maxc; j >= minc && ct < te; j--)
			{
				System.out.print(arr[maxr][j]+" ");
				ct++;
			}
			maxr--;
			
			for(int i = maxr; i >= minr && ct < te; i--)
			{
				System.out.print(arr[i][minc]+" ");
				ct++;
			}
			minc++;
		}
	}

}
