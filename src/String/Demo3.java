package String;

public class Demo3 
{
	public static void main(String[] args) 
	{
	    String s1="amytech";
		String s2="Amytech";
		
		System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,6));	
	}

}
