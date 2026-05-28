
import java.util.Scanner;

public class assg {

    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Input the amount of electricity consumed
            System.out.print("Enter the electricity consumption in kWh: ");
            double consumption = sc.nextDouble();
    
            if (consumption < 0) {
                System.out.println("Consumption cannot be negative.");
            } else {
                double bill = calculateMonthlyBill(consumption);
                System.out.printf("Your monthly bill is: $%.2f%n", bill);
            }
    
            sc.close();
        }
    
        public static double calculateMonthlyBill(double consumption) {
            double costPerKWh;
    
            // Define the cost brackets (in INR per kWh)
            if (consumption <= 100) {
                costPerKWh = 3.00; // ₹3.00 per kWh for the first 100 kWh
            } else if (consumption <= 300) {
                costPerKWh = 5.00; // ₹5.00 per kWh for 101-300 kWh
            } else if (consumption <= 500) {
                costPerKWh = 7.00; // ₹7.00 per kWh for 301-500 kWh
            } else {
                costPerKWh = 10.00; // ₹10.00 per kWh for above 500 kWh
            }
    
            // Calculate the total cost
            return consumption * costPerKWh;
        }
    }
    