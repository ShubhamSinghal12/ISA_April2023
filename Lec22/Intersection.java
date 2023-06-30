package Lec22;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,1,3,3,3,4,4,5,5,5,6};
		int[] arr2 = {1,1,1,2,2,2,3,6,6,6,7,7,8};
		
		System.out.println(intersect(arr1, arr2));
	}
	
	public static ArrayList<Integer> intersect(int[] arr1 , int[] arr2)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j])
			{
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i] > arr2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}	
		return ans;
	}

}
