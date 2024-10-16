package collections.com;
import java.util.ArrayList;
import java.util.List;

public class task1 {
	public static void main(String[] args) {
	//What is Collection (grow-able, heterogeneous, wrapper type, user defined type)
	//collection is frame work they are grow-able in size and they are heterogeneous
	//What is Collections
	//What are Arrays (fixed, homogeneous, pt, wt, ut) 
	//What are Cursors in Collections (Iterator, ListIterator, Enumeration(legacy))
	//What is the difference b/w ArrayList and LinkedList
	//What is the difference b/w ArrayList(Not Synchronized) and Vector(Synchronized)(legacy)
				
	//StringBuffer(Synchronized) and StringBilder (Not Synchronized)
				
	//What is the difference b/w Vector(Synchronized) and Stack(LIFO)
				
	//Collection(I): List(I) : ArrayList(C) --> LinkedList(C) --> Vector(C) -->Stack(C)  
	//Collection(I): Set(I) : HashSet(C) --> LinkedHashSet(C)
	//Collection(I): Set(I) : SortedSet(I) --> NavigableSet(I) --> TreeSet(C)
				
	//Map(I) : --> HashMap(C), LinkedHashMap(C)
	//Map(I) : --> IdentityHashMap(C), WeakHashMap(C)
	//Map(I) : --> SortedMap(I) --> NavigableMap(I) --> TreeMap(C)
	//Map(I) : --> Dictionary(AC) --> HashTable(C)
				
	//Project Level: HashMap, [ArrayList, LinkedList for test date]
				
	//Type          : Data-Structure
	//ArrayList  	: Re-sizeable Array- (perform wise array list is slow)
	//LinkedList 	: Double Linked List - for searching huge amount date we can use linkedlist
	//Stack      	: Linear Data Structure
	//HashSet    	: HashTable
	//LinkedHashSet : HashTable and LinkedList
	//TreeSet  		: TreeMap
	//HashMap       : HashTable
	//LinkedHashMap : HashTable and LinkedList
	//TreeMap       : Red Black Tree
		
	//ArrayList (C) : Search / Add 
	//array list faster in terms of adding
    //array list slower in modifying because all the index position should be change they move from one to other position  
	
	//Using ArrayList we can traverse the data  in one direction
	//When you insert or remove an element from the middle of the array-list, 
	//all elements need to be shifted to maintain the order
		
	//List (I): Insertion Order / Duplicated Allowed
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);//[10, 20, 300, 30, 40, 50]
		
		//update- add(index,num); for update the value go for set method
		list.add(2, 300);//index position will change 
		System.out.println(list);//[10, 20, 300, 30, 40, 50]
		
		//update---> set(index,elements);
		list.set(3, 400);
		System.out.println(list);//10, 20, 300, 400, 40, 50]

		//delete: remove(index)
		list.remove(2);
		System.out.println(list);//10, 20, 400, 40, 50]
		System.out.println(list.remove(2));//400
		System.out.println(list);//[10, 20, 40, 50]
		
		//Search ; get(index);
		System.out.println(list.get(3));//40 
		
		//indexOf(element)
		System.out.println(list.indexOf(20));//1
		System.out.println(list.indexOf(400));//2
		
		
		
	}
}
