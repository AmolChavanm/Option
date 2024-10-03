package Pratice_seesion;

import java.util.Arrays;

public class a6 
{
	public static void main(String[] args) 
	{
		int ar[]= new int[4];
		
		ar[0]=12;
		ar[1]=32;
		ar[2]=54;
		ar[3]=2;
		
		System.out.println(ar.length);

		Arrays.sort(ar);
		
		System.out.println("Array element in ascedning order");
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("Sorting of array in Decending order");
		
		for(int i=3;i>=0;i--)
		{
			
			System.out.println(ar[i]);
			
			
			
		}
		
		
		
		
		
	}

}
