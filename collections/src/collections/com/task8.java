package collections.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class task8 {
	//Map(I) : --> HashMap(C), LinkedHashMap(C)
	//Map(I) : --> IdentityHashMap(C), WeakHashMap(C)
	//Map(I) : --> SortedMap(I) --> NavigableMap(I) --> TreeMap(C)
	//Map(I) : --> Dictionary(AC) --> HashTable(C)
	
	//HashMap() is very important and project level
	public static void main(String[] args) {
		//haspMap:null key once and Null value Many,Duplicate values
		//LinkedHashMap:null key once and Null value Many,Duplicate values
		//TreeMap:Sorting Ordered,Null key not allowed and Null Value Many,Duplicate values
		
		//haspMap:Unordered ,null key once and Null value Many,Duplicate values
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Namefive");
		map.put(2, "Nametwo");
		map.put(4, "Namethree");
		map.put(5, "Nameone");
		map.put(1, "Namefour");
		map.put(8, "Nameone");
		map.put(7, "Namethree");
		map.put(1, "Nameone");
		map.put(7, "Nameone");
		map.put(null, "Nameone");
		map.put(null, null);
		map.put(1, null);
		System.out.println(map);
		
		//LinkedhaspMap:Insertion ordered ,null key once and Null value Many,Duplicate values
		LinkedHashMap<Integer,String> map1 = new LinkedHashMap<Integer,String>();
		map1.put(1, "Namefive");
		map1.put(2, "Nametwo");
		map1.put(4, "Namethree");
		map1.put(5, "Nameone");
		map1.put(1, "Namefour");
		map1.put(8, "Nameone");
		map1.put(7, "Namethree");
		map1.put(1, "Nameone");
		map1.put(7, "Nameone");
		map1.put(null, "Nameone");
		map1.put(null, null);
		map1.put(1, null);
		System.out.println(map1);
		
		//TreeMap:Sorting Ordered,Null key not allowed and Null Value Many,Duplicate values
		TreeMap<Integer,String> map12 = new TreeMap<Integer,String>();
		map12.put(1, "Namefive");
		map12.put(2, "Nametwo");
		map12.put(4, "Namethree");
		map12.put(5, "Nameone");
		map12.put(1, "Namefour");
		map12.put(8, "Nameone");
		map12.put(7, "Namethree");
		map12.put(1, "Nameone");
		map12.put(7, "Nameone");
		map12.put(1, null);
		System.out.println(map12);
		
		System.out.println(map12.keySet());
		System.out.println(map12.clone());
		System.out.println(map12.replace(1, null, "name"));
		System.out.println(map12.values());
		
	}

}
