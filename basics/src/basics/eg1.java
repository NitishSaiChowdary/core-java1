package basics;

import java.util.ArrayList;
import java.util.Iterator;

public class eg1 {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("firstname");
//		list.add("lastname");
//		list.add("username");
//		list.add("useremailid");
//		list.add("usermobileno");
//		System.out.println(list);//[firstname, lastname, username, useremailid, usermobileno]
//		
//		Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//			
//			System.out.println(iterator.next());/*firstname
//                                                lastname
//                                                Username
//                                                useremailid
//                                                usermobileno*/
//       }
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
	}

}
