package variable;

public class stat_globsl 
{
	static int a=22;
	 int b=66;
		static int c=5552;

	 
	 
	 public void m1()
	 {
		 System.out.println(stat_globsl.a);
		 System.out.println(b);
	 }
	 public static void m2()
	 {
		 System.out.println(stat_globsl.a);
		 System.out.println(stat_globsl.c);
	 }
	 
	 public static void main(String[] args)
	 {
		 stat_globsl aa= new stat_globsl();
		 aa.m1();
		 m2();
		
	}

}
