package Lec41;

public class Queue {

	private int[] arr;
	private int front;
	private int size;
	
	Queue()
	{
		this(5);
	}
	Queue(int cap)
	{
		this.arr = new int[cap];
		this.front = 0;
		this.size = 0;
	}
	
	public int size() // Return No of element in my stack
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	public boolean isFull()
	{
		return this.size == this.arr.length;
	}
	
	public void enqueue(int ele) throws Exception // Complexity O(1)
	{
		if(this.isFull())
		{
			throw new Exception("Queue Overflow");
		}
		this.arr[(this.front+this.size)%this.arr.length] = ele;
		this.size++;
	}
	
	public int dequeue() throws Exception // O(1)
	{
		if(isEmpty())
		{
			throw new Exception("Queue UnderFlow");
		}
		int x = this.arr[this.front];
		this.front = (this.front+1)%this.arr.length;
		this.size--;
		return x;
	}
	
	public int peek() throws Exception //O(1)
	{
		if(isEmpty())
		{
			throw new Exception("Queue UnderFlow");
		}
		
		return this.arr[this.front];
	}
	
	public void display()
	{
		for(int i = this.front; i < this.front+this.size; i++)
		{
			System.out.print(this.arr[i%this.arr.length]+" ");
		}
		System.out.println();
	}

}
