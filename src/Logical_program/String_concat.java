package Logical_program;

public class String_concat 
{
	public static void main(String[] args) 
	{
		String a="My name";
		String b=" is Amol ";
		String c="Balasaheb Chavan";
		
		String d=a.concat(b).concat(c); // here, Concat () is non-static method in java
		System.out.println(d);
		
		
	}

	
}


 