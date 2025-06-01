package week2.questions;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String val, pass = "iLoveKpBa123";
        int i = 0;

        while(i < 3)
        {
            System.out.println("Enter your password: ");
            val = sc.nextLine();

            if(val.equals(pass))
            {
                System.out.println("Access Granted!");
                break;
            }

            else if(i < 2)
                System.out.println("Wrong password! Try again!");

            else
                break;

            i++;
        }
        if(i == 3)
            System.out.println("Access Locked!");
    }
}
