package week5.questions;
import java.util.Scanner;

public class BankAccObject{
    
    private String accHolderName;
    private int accNumber;
    private double balance = 1000;

    public void deposit(double amount){
        if(amount >= 100){
            this.balance += amount;
            System.out.println("Amount deposited!\nNew Balance: " + this.balance);
        }

        else{
            System.out.println("Amount should be 100 or more than 100!");
        }
    }

    public void withDraw(double amount){
        if(amount > 100 && (this.balance-amount) > 100){
            this.balance -= amount;
            System.out.println("Amount with drawn! New Balance: "+ this.balance);
        }

        else{
            System.out.println("Invalid Amount!");
        }
    }

    public void setBalance(){

        boolean state = true;
        double amount;
        int option;
        Scanner sc = new Scanner(System.in);

        while(state){  
            System.out.println("Options:\n1. Deposit\n2. Withdraw\n3. (3 or any key) exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount you want to deposit: ");
                    amount = sc.nextDouble();
                    deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw: ");
                    amount = sc.nextDouble();
                    withDraw(amount);
                    break;
            
                default:
                    state = false;
                    System.out.println("Thank you for doing banking with us!");
                    break;
            }
        }
    }

    public static void main(String[] args){

        BankAccObject ba1 = new BankAccObject();
        ba1.setBalance();
    }
}
