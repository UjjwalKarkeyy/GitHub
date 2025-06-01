package week1;

import java.util.Scanner;

public class JavaVarEx {
    public static void main(String[] args) {
        int var = 5;
        float newvar = 5.5f;
        long phnum = 9824097004L;
        char letter = 'e'; // Primitive --> Stores value directly

        String name = "Ujjwal"; // Non-primitive --> Stores reference by creating object

        System.out.println("The value is: " + var + "\nThe new var is: " + newvar + "\nAnd phone number is: " + phnum + "\nLetter is: " + letter + "\nHis name is: " + name);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The user entered value is: " + num);


    }
}
