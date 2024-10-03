package Array;

public class Two_D_Array 
{
	public static void main(String[] args) 
	{
		
		int ar[][]=new int[2][3];
		
		ar[0][0]=21;
		ar[0][1]=3;
		ar[0][2]=67;
		ar[1][0]=32;
		ar[1][1]=87;
		ar[1][2]=65;
		
		//System.out.println(ar.length);

		int row=ar.length;
		int col=ar[0].length;
		System.out.println(row);
		System.out.println(col);
		
		System.out.println("-------Printing all no of Array-------");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.println(ar[i][j]);
			}
		}
		
		
	}

}
