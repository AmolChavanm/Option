package variable;

public class nonstatc_globa 
{
	int num=1222;
	int num1=44433;
	
	
	public void t1()
	{
		
		System.out.println(num);
	}
	
	public void m2()
	{
		System.out.println(num1);
		
	}
	public static void main(String[] args) 
	{
		
		nonstatc_globa aa = new nonstatc_globa();
		aa.m2();
		aa.t1();
		System.out.println(aa.num);
		System.out.println(aa.num1);
	}

}
