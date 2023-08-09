package Lec37;

public class QueensKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2;
		int n = 4;
		boolean[][] board = new boolean[n][n];
//		qc(board, 0, n,0,0,"");
//		qcbr(board, 0, 0, 0, 4, "");
		Nqueens(board, 0, n,"");

	}
	
	public static boolean isItPossible(boolean[][] board,int cr,int cc)
	{
		for(int i = cr; i>= 0; i--)
		{
			if(board[i][cc])
			{
				return false;
			}
		}
		
		for(int j = cc; j >= 0; j--)
		{
			if(board[cr][j])
			{
				return false;
			}
		}
		
		for(int i = cr,j = cc; i >= 0 && j >= 0;i--,j--)
		{
			if(board[i][j])
			{
				return false;
			}
		}
		for(int i = cr,j = cc; i >= 0 && j < board[0].length;i--,j++)
		{
			if(board[i][j])
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void qc(boolean[][] board,int qp,int tq,int lr,int lc,String ans)
	{
		if(qp == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lr; i < board.length; i++)
			{
				int j = 0;
				if(i == lr)
					j = lc;
				
				for(; j < board[0].length; j++)
				{
					if(!board[i][j] && isItPossible(board, i, j))
					{
						board[i][j] = true;
						qc(board, qp+1, tq,i,j,ans+"q"+"b"+i+j+" ");
						board[i][j] = false; // Undo Backtracking
					}
				}
			}
		}
	}
	
	
	public static void qcbr(boolean[][] board,int r,int c,int qp,int tq,String ans)
	{
		if(qp == tq)
		{
			System.out.println(ans);
		}
		else if(r >= board.length)
		{
			return;
		}
		else if(c >= board[0].length)
		{
			qcbr(board, r+1, 0, qp, tq, ans);
		}
		else
		{
			if(isItPossible(board, r, c))
			{
				board[r][c] = true;
				qcbr(board, r+1,0, qp+1, tq, ans+"qb"+r+c+" "); //Pick
				board[r][c] = false;
			}
			
			qcbr(board,r,c+1, qp, tq, ans); //Not Pick
		}
	}
	
	public static void Nqueens(boolean[][] board,int qp,int tq,String ans)
	{
		if(qp == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int c = 0;c < board[0].length;c++)
			{
				if(isItPossible(board, qp, c))
				{
					board[qp][c] = true;
					Nqueens(board, qp+1, tq, ans+"qb"+qp+c+" ");
					board[qp][c] = false;
				}
			}
		}
	}

}
