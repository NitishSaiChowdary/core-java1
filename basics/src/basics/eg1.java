package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


public class eg1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("firstname");
		list.add("lastname");
		list.add("username");
		list.add("useremailid");
		list.add("usermobileno");
//		System.out.println(list);//[firstname, lastname, username, useremailid, usermobileno]
		
		Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
			
			System.out.println(iterator.next());/*firstname
                                                lastname
                                                Username
                                                useremailid
                                                usermobileno*/
       }
        
        System.out.println(   );   System.out.println(   );
        ArrayList<String> list1 = new ArrayList<String>();
		list1.add("NameOne");
		list1.add("NameTwo");
		list1.add("NameThree");
		list1.add("NameFour");
		list1.add("NameFive");
		
		for (int i = 0; i < list1.size(); i++) {
			
			String name = list1.get(i); // list.get(index)
			if (name.equals("NameThree")) {
				//break;
				continue;
			}
			System.out.println(name);
		}
		
		Stack<String> ss = new Stack<String>();
		ss.add("A"); 
		ss.add("B");
		ss.add("C");
		ss.add("D");
		ss.add("E");
//		System.out.println(ss.search("A")); 
//     	System.out.println(ss.search("E")); 
//		System.out.println(ss.search("F")); 
//		System.out.println(ss.search("G")); 
//
		System.out.println(ss.peek());
		
		//E
		//D
		//C
		//B
		//A
	}

}
