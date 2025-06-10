package week2.questions;

import java.util.Scanner;

public class Q6W2Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0)
            System.out.println("Divisible by 3 and 5");

        else
            System.out.println("Not divisible by 3 and 5");

    }
}
