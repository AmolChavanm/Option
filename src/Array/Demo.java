package Array;

import java.util.Arrays;

public class Demo 
{
	public static void main(String[] args) 
	{
		String[]std=new String[5];
		
		std[0]="Amol";
		std[1]="Ravindra";
		std[2]="Rahul";
		std[3]="Avinash";
		std[4]="Shiv";
		
		System.out.println(std.length);
		System.out.println("---------Printing all no of Array--------");
		for(int i=0;i<=4;i++)
		{
			
			System.out.println(std[i]);
			
		}
		
		System.out.println("--------Sorting of Array element-------");
 
		Arrays.sort(std);  // static method 
		
		for(int i=0;i<=4;i++)
		{
			
			System.out.println(std[i]);
			
		}
		
	}

}
