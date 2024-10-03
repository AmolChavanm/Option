package Logical_program;

public class find_duplicate_no_array
{
	public static void main(String[] args) 
	{
		int ar[]=new int[] {3,4,6,8,9,9,1,21,12,23,45,67,89,89,12,3};
		
		System.out.println("Duplicate number from Array");
		
		// find duplicate no by using for loop

		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
	}
			
		
	
	
}
