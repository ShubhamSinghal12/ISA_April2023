package Lec43;

import Lec41.Stack;

public class DynamicStack extends Stack{

	
	DynamicStack() {
		super();
	}
	
	DynamicStack(int cap)
	{
		super(cap);
	}
	
	@Override
	public void push(int ele) // Complexity O(1)
	{
		if(this.isFull())
		{
			int[] na = new int[super.arr.length*2];
			for(int i = 0; i < top;i++)
				na[i] = super.arr[i];
			super.arr = na;
		}
		
		super.arr[super.top++] = ele;
	}
	
}
