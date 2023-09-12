package Lec44;
import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,5,8,6,4,9,2};
		System.out.println(Arrays.toString(nextGreater(arr)));
		
	}
	
	public static int[] nextGreater(int[] arr)
	{
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[st.peek()] < arr[i])
			{
				int x = st.pop();
				ans[x] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			ans[st.pop()] = -1;
		}
		return ans;
	}
	

}