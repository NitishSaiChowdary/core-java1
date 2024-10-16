package collections.com;

import java.util.Enumeration;
import java.util.Vector;

public class task5 {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		vec.add("Nameone");
		vec.add("Nametwo");
		vec.add("Namethree");
		vec.add("Namefour");
		vec.add("Namefive");
		System.out.println(vec);
		
		Enumeration<String> elements =vec.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
			  
		}
	}
}
