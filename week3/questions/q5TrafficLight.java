package week3.questions;
import java.util.Scanner;

public class q5TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the signal: ");
        String signal = sc.nextLine();

        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;
        
            case "yellow":
                System.out.println("Slow down");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid signal!");
        }
    }
}
