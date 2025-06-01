package week2.questions;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float val, bal = 5000;

        while(bal > 0)
        {
            System.out.print("Enter the value: ");
            val = sc.nextFloat();

            if(val > bal)
            {
                System.out.println("ERROR: Insufficient balance for this withdrawal!");
                continue;
            }

            else
                System.out.println("Withdrew amount: " + val);
            
            bal -= val;
        }
    }
}
