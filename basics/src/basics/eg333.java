package basics;

public class eg333 {
	public static void main(String[] args) {
		//instering the string in b/w
		String s1 = "Hello Java";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s2.insert(6,"this is "));
		
		// trim() method.
		String s3 = "  hey this java  ";
		System.out.println(s3.trim());
		
		//strip() method 
		System.out.println(s3.strip());
		System.out.println(s3.stripIndent());//Returns a string whose value is this string, with incidental white space removed fromthe beginning and end of every line.
		
		
		
		
		
	}

}
