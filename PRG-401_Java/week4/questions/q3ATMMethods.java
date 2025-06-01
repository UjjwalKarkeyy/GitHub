package week4.questions;
import java.util.Scanner;

public class q3ATMMethods
{

    static double balance = 10000;

    public static void withDrawAmount(double amount)
    {
        if((int)amount <= 100)
        {
            System.out.println("Can't withdraw amount less than 100");
        }

        else if(amount < balance)
        {
            balance -= amount;
            System.out.println("With Drawing Amount: " + amount);
            System.out.println("\nNew balance: " + balance + "\n");
        }
        
        else if(amount > balance || balance == 0.0)
        {
            
            System.out.println("Insufficient Balance!");
        }
    }
    public static void depositAmount(double amount)
    {
        if((int)amount >= 100)
        {
            balance += amount;
            System.out.println("Depositing amount: " + amount);
            System.out.println("\nNew balance: " + balance + "\n");
        }

        else
            System.out.println("Can't deposit less than 100.0");
    }
    public static void checkBalance()
    {
        System.out.println("Your balance is: " + balance + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount;
        int option;
        boolean isOn = true;

        while(isOn)
        {
            System.out.println("Enter your option:\nPress '1' for With Draw\nPress '2' for Deposit\nPress '3' for Checking Balance\nPress '0' or any key to exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the withdraw amount: ");
                    amount = sc.nextDouble();
                    withDrawAmount(amount);
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    amount = sc.nextDouble();
                    depositAmount(amount);
                    break;
                case 3:
                    System.out.println("Checking balance... ");
                    checkBalance();
                    break;
                default:
                    isOn = false;
                    System.out.println("Thank you for visiting our ATM!");
                    break;
            }
        }
    }
}