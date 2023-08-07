package Lec36;

public class Queen1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		boolean[] board = new boolean[n];
//		qp(board, 0, tq, "");
		qc(board, 0, tq, 0, "");

	}
	
	public static void qp(boolean[] board,int qp,int tq,String ans)
	{
		if(qp == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				if(!board[i])
				{
					board[i] = true;
					qp(board, qp+1, tq, ans+"q"+qp+"b"+i+" ");
					board[i] = false; // Undo Backtracking
				}
			}
		}
	}
	
	public static void qc(boolean[] board,int qp,int tq,int lp, String ans)
	{
		if(qp == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lp; i < board.length; i++)
			{
				if(!board[i])
				{
					board[i] = true;
					qc(board, qp+1, tq,i,ans+"q"+"b"+i+" ");
					board[i] = false; // Undo Backtracking
				}
			}
		}
	}

}
