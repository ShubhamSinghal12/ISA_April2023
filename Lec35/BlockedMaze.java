package Lec35;

public class BlockedMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//		int m = 3;
//		int n = 3;
//		boolean[][] maze = new boolean[m][n];
//		mazePath(maze,0, 0, "");
		
	}
	
	public static void mazePath(boolean[][] maze, int cr,int cc,String ans)
	{
		if(cr == maze.length-1 && cc == maze[0].length-1)
		{
			System.out.println(ans);
		}
		else if(cr > maze.length-1 || cc > maze[0].length-1 || cr < 0 || cc < 0 || maze[cr][cc])
		{
			return;
		}
		else
		{
			maze[cr][cc] = true;
			mazePath(maze, cr+1, cc, ans+"D");
			mazePath(maze, cr, cc+1, ans+"R");
			mazePath(maze, cr-1, cc, ans+"U");
			mazePath(maze, cr, cc-1, ans+"L");
			maze[cr][cc] = false; //Undo Backtracking
		}
	}

}
