package Lec23;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		diagT(arr);
	}
	
	public static void diagT(int[][] arr)
	{
		int si = arr.length-1;
		int sj = 0;
		
		for(int i = 1; i < arr.length+arr[0].length;i++)
		{
			ArrayList<Integer> al = new ArrayList<>();
			int cr = si;
			int cc = sj;
			while(cr < arr.length && cc < arr[0].length) // cr >= 0 && cc >= 0
			{
				al.add(arr[cr][cc]);
				cr++;
				cc++;
			}
			
			if(i%2 == 1)
			{
				System.out.println(al);
			}
			else
			{
				Collections.reverse(al);
				System.out.println(al);
			}
			
			if(si != 0)
			{
				si--;
			}
			else
			{
				sj++;
			}
		}
	}

}
