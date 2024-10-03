package pseesion;

import java.util.ArrayList;

public class concantelisy
{
	public static void main(String[] args) 
	{
		// Given list1 of element
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		// given list :2 
		
		ArrayList <Integer> list2 = new ArrayList <Integer>();
		
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		
		
		// created new empty list
		ArrayList <Integer> concatenated = new ArrayList <Integer>();
		
		concatenated.addAll(list1);
		concatenated.addAll(list2);
		
		
		System.out.println("List1 :"+list1);
		System.out.println("List2 :"+list2);
		System.out.println("Concanated list :"+concatenated);

		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
