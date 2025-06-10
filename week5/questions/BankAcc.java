package week5.questions;

import java.util.Scanner;

public class BankAcc {
    
    public static void main(String[] args) {
        
        String accHolderName;
        int accNum, option;
        double balance; 
        boolean state = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name: ");
        accHolderName = sc.nextLine();
        System.out.println("Enter account number: ");
        accNum = sc.nextInt();
        System.out.println("Enter your balance: ");
        balance = sc.nextDouble();

        BankAccount a1 = new BankAccount(accHolderName, accNum, balance);
        
        while(state)
        {  
            System.out.println("Options:\n1. Deposit\n2. Withdraw\n3. (3 or any key) exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    a1.deposit();
                    break;
                case 2:
                    a1.withDraw();
                    break;
            
                default:
                    state = false;
                    System.out.println("Thank you for doing banking with us!");
                    break;
            }
        }
    }
}

class BankAccount
{
    String accHolderName;
    int accNum;
    double balance;

    Scanner sc = new Scanner(System.in);

    public void deposit()
    {
        System.out.println("Deposit amount: ");
        
        double depoAmount = sc.nextDouble();
        this.balance = this.balance + depoAmount;
    }
    
    public void withDraw()
    {
        System.out.println("With draw amount: ");
        double withDrawAmount = sc.nextDouble();
        this.balance = this.balance - withDrawAmount;
    }

    public void printInfo()
    {
        
    }

    BankAccount(){}

    BankAccount(String accHolderName, int accNum, double balance){
        this.accHolderName = accHolderName;
        this.accNum = accNum;
        this.balance = balance;
    }
}


