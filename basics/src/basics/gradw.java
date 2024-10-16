package basics;

import java.util.Scanner;

public class gradw {
	public static void main(String[] args) {
		System.out.println("Enter your marks:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int marks1 = sc.nextInt();
	      
		    if(marks1<50){  
		        System.out.println("Fail");  
		    }  
		    else if(marks1>=50 && marks1<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks1>=60 && marks1<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks1>=70 && marks1<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks1>=80 && marks1<90){  
		        System.out.println("A grade");  
		    }else if(marks1>=90 && marks1<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
	}

}
