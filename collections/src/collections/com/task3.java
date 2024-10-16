package collections.com;

import java.util.ArrayList;
import java.util.Iterator;

public class task3 {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Nameone");
		list.add("Nametwo");
		list.add("Namethree");
		list.add("Namefour");
		list.add("Namefive ");
		System.out.println(list);
		
		Iterator<String>it=list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
//Nameone
//Nametwo
//Namethree
//Namefour
//Namefive 




