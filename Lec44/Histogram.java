package Lec44;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	 public int largestRectangleArea(int[] arr) {
	     
		 	int maxA = 0;
			Stack<Integer> st = new Stack<Integer>();
			for(int i = 0; i < arr.length; i++)
			{
				while(!st.isEmpty() && arr[st.peek()] > arr[i])
				{
					int x = st.pop();
					int n = i;
					// int p = st.isEmpty() ? -1 : st.peek();
					int p = -1;
					if(!st.isEmpty())
						p = st.peek();
					int area = (n-p-1)*arr[x];
					maxA  = Math.max(maxA, area);
				}
				st.push(i);
			}
			while(!st.isEmpty())
			{
				int x = st.pop();
				int n = arr.length;
				int p = st.isEmpty() ? -1 : st.peek();
				
				int area = (n-p-1)*arr[x];
				maxA  = Math.max(maxA, area);
			}
		 
			return maxA;
		 
	    }

}
