package exception_handling;

public class demo1 
{
	public static void main(String[] args) 
	{
		
		int a=22;
		int b=0
				;
		
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception handled");
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Null pointer execption handled");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			
			System.out.println("Array out of bounds execeptoion handled");
		}
		catch (Exception e)
		{
			System.out.println("Generic execption handled");
		}
		System.out.println("Last line");

	}


}
