package Lec44;

import java.util.Stack;

public class Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map = {{0,1,0,1},{0,0,1,1},{1,0,0,1},{0,1,0,0}};
		printCeleb(map);
			
	}
	
	public static void printCeleb(int[][] map)
	{
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i < map.length; i++)
		{
			st.push(i);
		}
		while(st.size() != 1)
		{
			int a = st.pop();
			int b = st.pop();
			
			if(map[a][b] == 1)
			{
				st.push(b);
			}
			else
			{
				st.push(a);
			}
		}
		
		int c = st.pop();//Candidate Celeb
		boolean flag = true;
		for(int i = 0; i < map.length; i++)
		{
			if(i != c && (map[c][i] != 0 || map[i][c] != 1))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Celeb is: "+c);
		}
		else
		{
			System.out.println("No Celeb");
		}
		
		
		
	}
	
	

}
