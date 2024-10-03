package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_list 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		System.out.println("------Before adding element to ArrayList-------");
        System.out.println(al.isEmpty());  //true
		System.out.println(al.size());
		
		al.add("Manual");
		al.add("Automation");
		al.add('A');
		al.add(21);
		al.add(null);
		al.add(21.2f);
		al.add("Manual");

		
		System.out.println("------After adding element to ArrayList-------");
		System.out.println(al.isEmpty());  //true
		System.out.println(al.size());
		
		System.out.println("-----Printing the ArralList-------");
		System.out.println(al); //[Manual, Automation, A, 21, null, 21.2, Manual]

		
		
		System.out.println("------Other Methods of Collection------");
		System.out.println(al.get(1));
		System.out.println(al.get(4));
		System.out.println(al.indexOf(21.2f));
		System.out.println(al.indexOf("Manual"));
		System.out.println(al.lastIndexOf("Manual"));
		
		System.out.println("-------------------------------------");
		
		System.out.println(al.contains("Automation"));  // true
		System.out.println();
		al.add(2, "Selenium");
		System.out.println(al);  //[Manual, Automation, Selenium, A, 21, null, 21.2, Manual]

		al.set(1, "API");
		System.out.println(al);  //[Manual, API, Selenium, A, 21, null, 21.2, Manual]

		al.remove(0);
		System.out.println(al);
		
		System.out.println("------use of cursor in collection------");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
		
			System.out.println(itr.next());
			
		}
		
		System.out.println("------Use of loop------");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
			
			
			
			
		}
	
		
		
		
		

		
		
		
		
		
		
		
	}

}
