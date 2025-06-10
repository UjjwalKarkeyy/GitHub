package week2.questions;
import java.util.Scanner;

public class Q7W2LoginAuth {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter UserName: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (userName.equals("John") && pass.equals("TheDon"))
            System.out.println("Login Successful!" + " Welcome back! " + userName);

        else if(!(userName.equals("John")))
            System.out.println("Username not found!");

        else
            System.out.println("Incorrect password!");
    }
}
