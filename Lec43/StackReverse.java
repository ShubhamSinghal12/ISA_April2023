package Lec43;

public class StackReverse {
	
	public static void main(String[] args) throws Exception{
		
		DynamicStack ds = new DynamicStack();
		for(int i = 1; i <= 5;i++)
		{
			ds.push(i);
		}
		
		ds.display();
		ar(ds);
		System.out.println();
		ds.display();
	}
	
	
	public static void dr(DynamicStack st) throws Exception
	{
		DynamicStack temp = new DynamicStack();
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		
		temp.display();
		while(!temp.isEmpty())
		{
			st.push(temp.pop());
		}
		
	}
	
	public static void drR(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int n = st.pop();
			drR(st);
			System.out.print(n+" ");
			st.push(n);
		}
	}
	
	public static void ar(DynamicStack st) throws Exception
	{
		DynamicStack t1 = new DynamicStack();
		while(!st.isEmpty())
		{
			t1.push(st.pop());
		}
		arHelp(t1,st);
	}
	
	public static void arHelp(DynamicStack t1,DynamicStack t2) throws Exception
	{
		if(t1.isEmpty())
		{
			return;
		}
		else
		{
			int n = t1.pop();
			arHelp(t1, t2);
			t2.push(n);
		}
	}
}
