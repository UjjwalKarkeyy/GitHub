package week3.questions;
import java.util.Scanner;

public class q4Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the operator(+, -, *, /): ");
        String op = sc.nextLine();
        System.out.println("Enter the first value: ");
        a = sc.nextInt();
        System.out.println("Enter the second value: ");
        b = sc.nextInt();

        switch(op)
        {
            case "+":
            System.out.println("Addition: " + (a + b));
            break;

            case "-":
            System.out.println("Subtraction: " + (a - b));
            break;

            case "*":
            System.out.println("Multiplication: " + (a * b));
            break;

            case "/":
            System.out.println("Division: " + (a / b));
            break;

            default:
            System.out.println("Invalid operator!");
        }
    }
}
