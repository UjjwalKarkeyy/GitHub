package week2.questions;
import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value in celsius: ");
        double cel = sc.nextDouble();
        
        System.out.println("Celsius to Fahrenheit is: " + ( (cel * 9/5) + 32 ) );
    }
}
