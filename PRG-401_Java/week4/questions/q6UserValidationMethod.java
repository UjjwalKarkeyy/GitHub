package week4.questions;

import java.util.Scanner;

public class q6UserValidationMethod {
    
    String[] users = {"Ujjwal", "Ashiq", "Saurav", "Diwash"};
    String[] passwords = {"ujj123", "ash123", "sau123", "diw123"};

    public void validateUser(String username, String password){

        boolean isUser = true;
        for(String user: users){
            if(user.equals(username)){
                for(String pass: passwords){
                    if(pass.equals(password)){
                        isUser = true;
                        break;
                    }

                    isUser = false;
                }

                break;
            }
            
            else
                isUser = false;
        }
        if(isUser)
            System.out.println("Welcome back " + username);
        
        else
            System.out.println("Invalid username or password");

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q5UserValidationMethod u1 = new q5UserValidationMethod();

        System.out.println("Enter your username: ");
        String user = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();

        u1.validateUser(user, pass);
    }
}
