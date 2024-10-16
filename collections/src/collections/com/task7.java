package collections.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class task7 {
	public static void main(String[] args) {
		//set:Insertion Not Allowed,Duplicates not allowed 
		//List:Insertion  Allowed,Duplicates  allowed 
		// HashSet: No Insertion Order, Duplicates not Allowed
		// LinkedHashSet: Insertion Order, Duplicates not Allowed
		// TreeSet: Sorting Order, Duplicates not Allowed	
		
		
		//No Insertion Order, Duplicates not Allowed,null Allowed Once
		HashSet<String> set = new HashSet<String>();
		set.add("Nameone");
		set.add("Nametwo");
		set.add("Namefour");
		set.add("Nameone");
		set.add("Namethree");
		set.add("Nameone");
		set.add(null); 
	    System.err.println(set);//[Nameone, null, Namethree, Namefour, Nametwo]
		
		//Insertion Order, Duplicates not Allowed,,null Allowed Once
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("Nameone");
		set1.add("Nametwo");
		set1.add("Namefour");
		set1.add("Nameone");
		set1.add("Namethree");
		set1.add("Nameone");
		set1.add(null);
		set1.add(null);
	    System.err.println(set1);//[Nameone, Nametwo, Namefour, Namethree, null]
	    
	    //Sorting Order, Duplicates not Allowed,Null Not Allowed
		TreeSet<String> set12 = new TreeSet<String>();
		set12.add("Nameone");
		set12.add("Nametwo");
		set12.add("Namefour");
		set12.add("Nameone");
		set12.add("Namethree");
		set12.add("Nameone");
	    System.err.println(set12);//[Namefour, Nameone, Namethree, Nametwo]
			
	}

}
