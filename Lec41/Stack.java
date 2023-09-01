package Lec41;

public class Stack {
	
	private int[] arr;
	private int top;
	
	Stack()
	{
		this(5); // Default Stack size is 5
	}
	
	Stack(int size)
	{
		this.arr = new int[size];
		this.top = 0;
	}
	
	public int size() // Return No of element in my stack
	{
		return this.top;
	}
	
	public boolean isEmpty()
	{
		return this.top == 0;
	}
	public boolean isFull()
	{
		return this.top == this.arr.length;
	}
	
	public void push(int ele) throws Exception // Complexity O(1)
	{
		if(this.isFull())
		{
			throw new Exception("Stack Overflow");
		}
		
		this.arr[top++] = ele;
//		this.top++;
	}
	
	public int pop() throws Exception // O(1)
	{
		if(this.isEmpty())
		{
			throw new Exception("Stack UnderFlow");
		}
		
		return this.arr[--top];
		
//		this.top--;
//		return this.arr[top];
	}
	
	public int peek() throws Exception //O(1)
	{
		if(this.isEmpty())
		{
			throw new Exception("Stack UnderFlow");
		}
		
		return this.arr[top-1];
		
	}
	public void display()
	{
		for(int i = this.top-1; i >= 0; i--)
		{
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();
	}
}
