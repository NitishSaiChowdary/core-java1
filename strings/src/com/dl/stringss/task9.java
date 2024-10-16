package com.dl.stringss;

public class task9 {
public static void main(String[] args) {
	//replace():it will work with char method 
	
	String s1 = new String("I like java and I like python and I like html");
	System.out.println(s1.replace("l", "L"));//I Like java and I Like python and I Like htmL
	System.out.println(s1.replace("java","css"));//I like css and I like python and I like html
	System.out.println(s1.replaceFirst("l","L"));//I Like java and I like python and I like html
	//replaceAll();it will work with regex method 
	System.out.println(s1.replaceAll("a", "A"));//I like jAvA And I like python And I like html
	
	String s2 =new String ("Hello Java and Hello Python");
	char[] charArray = s2.toCharArray();
	charArray[6]='j';
	System.out.println(charArray);//Hello java and Hello Python
	
	
	
	
}
}
