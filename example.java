import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check given number ood or even: ");
        int n = sc.nextInt();
        int i = 5;
        if(n%2==0){
            System.out.println(n + " is even number");
        }else{
            System.out.println(n +"is odd number");
        }
    }
    
}
