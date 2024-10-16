package collections.com;

import java.util.Stack;

public class task6 {
	public static void main(String[] args) {
		//Stack is the child of the vector 
		//LIFO(last in First out)
		Stack<String> vec=new Stack<String>();
		vec.add("Nameone");
		vec.add("Nametwo");
		vec.add("Namethree");
		vec.add("Namefour");
		System.out.println(vec);//[Nameone, Nametwo, Namethree, Namefour]
		
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		//System.out.println(s);//[1, 2, 3, 4, 5]
		
//		s.pop();
//		System.out.println(s);//[1, 2, 3, 4]
//		s.pop();
//		System.out.println(s);//[1, 2, 3]
//		s.pop();
//		System.out.println(s);//[1, 2]
//		s.pop();
//		System.out.println(s);//[1]
//		s.pop();
//		System.out.println(s);//[]
		
		for (int i = 0; i <= s.size(); i++) {
			System.out.println(i);
		}		
		
		
	}

}
