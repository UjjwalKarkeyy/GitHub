package week5;

import java.util.Scanner;

public class BankAccObject {
    
    private String accHolderName;
    private int accNumber;
    private double balance;

    public void deposit(double amount)
    {
        if(amount >= 100)
        {
            this.balance += amount;
        }

        else
        {
            System.out.println("Amount should be 100 or more than 100!");
        }
    }

    public void withDraw(double amount)
    {
        if(amount > 100 && amount < (this.balance-100))
        {
            this.balance -= amount;
        }

        else
        {
            System.out.println("Invalid Amount!");
        }
    }

    public void setName(String name){
        this.accHolderName = name;
    }
    public void setBalance(double amount){

        boolean state = true;
        int option;
        Scanner sc = new Scanner(System.in);
        while(state)
        {  
            System.out.println("Options:\n1. Deposit\n2. Withdraw\n3. (3 or any key) exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    deposit(amount);
                    break;
                case 2:
                    withDraw(amount);
                    break;
            
                default:
                    state = false;
                    System.out.println("Thank you for doing banking with us!");
                    break;
            }
        }
    }
}
