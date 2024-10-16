package basics;
import java.util.Scanner;
public class fed4 {
	    public static void main(String[] args) {
	        // Creating a scanner to read input
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        // Reading four integers from input
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        
	        
	        // Initialize sum to 0
	        int sum = 0;
	        
	        // Check each number and add to sum if it's negative
	        if (a < 0) sum += a;//sum= 0-14=-14
	        
	        if (b < 0) sum += b;//sum = -14-2=-16
	        if (c < 0) sum += c;//sum
	        if (d < 0) sum += d;
	        
	        // Print the sum (0 if no negative numbers)
	        System.out.println(sum);
	        
	        // Close the scanner
	        sc.close();
	}


}
