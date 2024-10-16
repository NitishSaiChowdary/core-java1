package collections.com;

import java.util.LinkedList;
import java.util.List;


public class task2 {
//LinkedList-->update / manipulation
//Using linkedList we can traverse the data  in both direction
//Insertion or Deletion in the middle of the linked list is faster
//Because it only involves changing the pointers of the neighboring nodes
//No shifting of elements is required

//LinkedList doesn't use index to access elements,
//Instead, you can traverse the list from the begging or end to reach a specific elements
//Linked List  elements are not stored in continuous memory locations,
//like they are stored in ArrayList
//Instead , Linked List consists of nodes (node=data + pointer)
  	
//Data    :The actual value of the element 
//pointer :Reference to next node in list 
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		System.out.println(list); // [10, 20, 30, 40, 50]

		list.set(1, 100);
		System.out.println(list); // [10, 100, 30, 40, 50]
		
		// Single Linked List : Only Forward
		// [10(data), --> 20, --> 30, --> 40, --> 50] --> null
        //  next         next     next    next    next
		// 24(ref) -----> 25 --->  47 -->  60 --> null

		// Double Linked List: Forward and Backward
		// [10(data), <--> 20, <--> 30, <--> 40, <--> 50] <--> null
		//  prev          prev    prev    prev    prev
		//  next          next    next    next    next
	    // 24(ref) -----> 25 --->  47 -->  60 --> null
		
		// Circular Linked List: Last element is linked to the first element
		// [10(data), --> 20, --> 30, --> 40,     --> 50] 
		//  prev          prev    prev    prev       prev
		//  next          next    next    next       next
		//    ^                                       |
		//    |---------------------------------------|

	}
}
