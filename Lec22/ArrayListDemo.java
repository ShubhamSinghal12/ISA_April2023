package Lec22;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		al.add(2,1000);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		al.set(2, -1000);
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.remove(2);
		al.add(30);
		System.out.println(al);
		
		System.out.println(al.contains(300));
		
		System.out.println(al.indexOf(30));
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		
		for(int val:al)
		{
			System.out.println(val);
		}

	}

}
