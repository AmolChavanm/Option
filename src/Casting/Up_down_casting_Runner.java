package Casting;

public class Up_down_casting_Runner 
{
	public static void main(String[] args)
	{
		Up_down_casting_Son aa = new Up_down_casting_Son(); // fahter's property
		System.out.println("----------Fahter property----------");
		aa.car();
		aa.home();
		aa.money();
		
		// son's property
	    System.out.println("--------Son's property----------");
		aa.bike();
		aa.laptop();
		
		// Upcasting 
		
		System.out.println("-----------Upcasting------------");
		Up_down_casting_Father a1 = new Up_down_casting_Son();
		a1.car();
		a1.home();
		a1.money();
		
	}

}
