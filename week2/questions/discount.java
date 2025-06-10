package week2.questions;
import java.util.Scanner;

public class discount {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Purchase Amount: ");
        float amount = sc.nextFloat();

        if(amount < 200)
            System.out.println("No Discount!");

        else if(amount >= 200 && amount <= 500)
            System.out.println("10% Discount!");

        else
            System.out.println("20% Discount!");
    }
}
