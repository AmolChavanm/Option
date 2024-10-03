package Pratice_seesion;

public class a7 
{
	public static void main(String[] args) 
	{
		int ar[][]=new int[2][2];
		
		
		ar[0][0]=10;
		ar[0][1]=4;
		ar[1][0]=65;
		ar[1][1]=21;

		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
