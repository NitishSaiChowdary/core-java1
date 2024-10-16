package collections.com;


import java.util.LinkedList;
import java.util.ListIterator;

public class task4 {
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("Nameone");
		list.add("Nametwo");
		list.add("Namethree");
		list.add("Namefour");
		list.add("Namefive ");
		System.out.println(list);
		
		ListIterator<String>it=list.listIterator();
		//Forward
		while (it.hasNext()) {
			System.out.println(it.next());
			//Nameone
			//Nametwo
			//Namethree
			//Namefour
			//Namefive 

			
		}
		//Backward
		System.out.println();
		while (it.hasPrevious()) {
			System.out.println(it.previous());
//			Namefive 
//			Namefour
//			Namethree
//			Nametwo
//			Nameone
		}
		
	}

}
