package Lec20;

import java.util.*;
public class Roses {
	
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0){
	          int n=sc.nextInt();
	          int []arr= new int [n];
	          for(int i=0;i<arr.length;i++) {
	        	  arr[i]=sc.nextInt();	   
	        	  }
	          int trgt=sc.nextInt();
               Rose(arr,trgt);
	      }
	}
	 public static void Rose(int[] arr, int M){
		   int sum = 0;
		   int ans1 = 0;
		   int ans2 = 0;
		   int diff = Integer.MAX_VALUE;
		   for(int i = 0; i< arr.length; i++ ){
			   for(int j = arr.length-1; j>i; j--){
				   sum = arr[i] + arr[j];
				   if(sum == M){
					   int differnce = arr[i]- arr[j];
					   int x = Math.abs(differnce);
					   if(x<diff){
						   diff = x;
						   ans1 = Math.min(arr[i], arr[j]);
						   ans2 = Math.max(arr[i], arr[j]);
					   }
				   }
			    }
	         }
				   System.out.println("Deepak should buy roses whose prices are "+ ans1 + " " + "and"+" "+ ans2 + ".");
	     }
}

