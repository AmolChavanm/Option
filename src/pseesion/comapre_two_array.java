package pseesion;

import java.util.Arrays;

public class comapre_two_array
{
	public static void main(String[] args) 
	{
		int ar[] = {1,2,3,4};
		int ar1[]= {5,6,7,8};
		int ar2[]= {1,2,3,4};
		
		System.out.println("ar[] & ar1 ="+Arrays.equals(ar, ar1));
		
		System.out.println("ar[] & ar2 ="+Arrays.equals(ar, ar2));
	}

}
