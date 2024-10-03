package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class vector
{
	
	public static void main(String[] args) 
	{
		Vector vtr = new Vector();
		
		System.out.println(vtr.capacity());
		System.out.println("------------------------");
		System.out.println(vtr.size());
		System.out.println("------------------------");
		System.out.println(vtr.isEmpty());
		System.out.println("------------------------");

		
		vtr.add("abc");
		vtr.add(20);
		vtr.add('A');
		vtr.add(null);
	    vtr.add("abc");
	 
	    System.out.println(vtr.capacity()); // 10
	    System.out.println(vtr.size()); //5 
	    System.out.println(vtr.isEmpty());  //false
	    System.out.println(vtr); //[abc, 20, A, null, abc]

	    System.out.println("---------------------");
		
	    
	    System.out.println(vtr.indexOf(20));
		System.out.println(vtr.lastIndexOf("abc"));
		System.out.println("----Other Methods-----");
		System.out.println(vtr.get(4));
		System.out.println(vtr.contains("abc"));
	    System.out.println("---------------------");

		vtr.add(3,"aaaa");
		System.out.println(vtr); //[abc, 20, A, aaaa, null, abc]

		
		
		vtr.remove(3);
		System.out.println(vtr);
		
		System.out.println("--------Cursor read---------");
		
		Enumeration enm = vtr.elements();
		
		
		while(enm.hasMoreElements())
		{
			
			System.out.println(enm.nextElement());
			
			
		}
		
   	System.out.println("------Reverse------");
	
	 Collections.reverse(vtr);
	
	 Enumeration enm1=vtr.elements();
	
    	while(enm1.hasMoreElements())
	 {
		System.out.println(enm1.nextElement());
	  
	 }
	
	
	
	
	}

}
