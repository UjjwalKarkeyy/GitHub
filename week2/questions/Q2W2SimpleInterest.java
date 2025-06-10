package week2.questions;

import java.util.Scanner;

public class Q2W2SimpleInterest {
    public static void main(String[] args) 
    {
        double principal, rate, time;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle: ");
        principal = sc.nextDouble();
        System.out.println("Enter rate: ");
        rate = sc.nextDouble();
        System.out.println("Enter time: ");
        time = sc.nextDouble();

        double si = (principal * time * rate)/100;

        System.out.println("The simple interest is: " + si);

    }
}
