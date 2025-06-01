package week3.questions;
import java.util.Scanner;

public class q11RestaurantOrder 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill = 0.0, price;
        
        while (true) {
            System.out.print("Enter item price or type 'exit' to finish: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            else
            {
                price = Double.parseDouble(input);
                totalBill += price;
            }
        }

        System.out.println("Total bill: $" + totalBill);
        scanner.close();
    }
}