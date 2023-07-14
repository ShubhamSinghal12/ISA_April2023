package Lec25;

import java.util.Arrays;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "The sky is blue";
		String[] words = st.split(" ");
		
		System.out.println(Arrays.toString(words));
		
//		for(int i = words.length-1; i >= 0; i--)
//		{
//			System.out.print(words[i]+" ");
//		}
	}

}
