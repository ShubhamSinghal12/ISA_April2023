package Lec20;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		arr = new int[]{1,2,3,4,5};
		
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();

		int sum = 0;
		for(int i:arr)
		{
			sum += i;
		}
		System.out.println(sum);
	}

}
