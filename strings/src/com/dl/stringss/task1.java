package com.dl.stringss;

public class task1 {
	public static void main(String[] args) {
		//1.what is string?
		//Strings are sequence of characters,string are immutable (once we create string we cannot modify)
		char a[]= {'h','e','l','l','o','w','o','r','l','d'};
		System.out.println(a);
		//2.how many ways we can create Strings?
		//two we can create the strings --a.Using Literal --b.Using New Keyword
		//a
		String name ="digital lync";
		System.out.println(name);
		//b
		String n = new String("hello word");
		System.out.println(n);
		//3.Different b/w length property and length()method
		//length property we use in arrays
		//length()method we use in strings 
		
		//length property 
		char ch1[]= {'n','i','t','i','s','h'};
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
		}
		//length()method
		String uname="Nitish";
		System.out.println(uname.length());
		//4.when we create String literal how many objects are created--only one object is created 
		//one object is created in string constant pool area
		//Memory
		String Username ="nitish";// one object in scp area 
		System.out.println(Username);
		//5.when we create String using new keyword how many objects are created
		// two Objects are created One object in heap area ,One object in SCP area
		String courseName =new String("java");
		System.out.println(courseName);
		//MemoryNote:courseName is a local variable is storted in stack area ,agian the same variable coursename will oint to heap(java) and scp area(java)
		String cName =new String("java");
		System.out.println(cName);
		//Memory Note:
		//cname is locla variable stored in stack area ,again th same variable
		//cname will point to help area(java) and cname and courseName both are at same location Scp(java)
	}

}
