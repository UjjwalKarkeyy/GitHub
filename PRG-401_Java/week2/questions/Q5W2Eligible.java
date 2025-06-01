package week2.questions;
import java.util.Scanner;

public class Q5W2Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age == 18)
            System.out.println("Eligible to vote");

        else if(age < 18)
            System.out.println("Not eligible to vote");

        else
            System.out.println("Already eligibel to vote");
    }
}
