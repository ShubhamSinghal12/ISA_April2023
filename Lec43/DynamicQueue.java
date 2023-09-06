package Lec43;

import Lec41.Queue;

public class DynamicQueue extends Queue {
	
	@Override
	public void enqueue(int ele) // Complexity O(1)
	{
		if(this.isFull())
		{
			int[] na = new int[super.arr.length*2];
			for(int i = super.front, j = 0; i < super.front+super.size; i++,j++)
			{
				na[j] = super.arr[i%super.arr.length];
			}
			
			super.arr = na;
			super.front = 0;
		}
		super.arr[(super.front+super.size)%super.arr.length] = ele;
		super.size++;
	}
	
}
