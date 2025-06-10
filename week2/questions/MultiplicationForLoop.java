package week2.questions;

import java.util.Scanner;

public class MultiplicationForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int val = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(val + " * " + i + " = " + val*i);
        }
    }
}
