package Lec37;

public class Queens2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2;
		int n = 4;
		boolean[][] board = new boolean[m][n];
//		qc(board, 0, 2,0,0,"");
		qcbr(board, 0, 0, 0, 2, "");

	}
	
	public static void qp(boolean[][] board,int qp,int tq,String ans)
	{
		if(qp == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j =0; j < board[0].length; j++)
				{
					if(!board[i][j])
					{
						board[i][j] = true;
						qp(board, qp+1, tq, ans+"q"+qp+"b"+i+j+" ");
						board[i][j] = false; // Undo Backtracking
					}
				}
			}
		}
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
					if(!board[i][j])
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
			board[r][c] = true;
			qcbr(board, r,c+1, qp+1, tq, ans+"qb"+r+c+" "); //Pick
			board[r][c] = false;
			
			qcbr(board,r,c+1, qp, tq, ans); //Not Pick
		}
	}
	

}
