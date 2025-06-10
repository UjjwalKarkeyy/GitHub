package week4.questions;
import java.util.Scanner;

public class LibManage 
{
    static String[] books = {"Ankhe dekhe", "Love in Air", "Intersteller", "Micheal Jackson", "Alchemist"};
    static String[] borrowedBooks = {"Ankhe dekhe", "Love in Air"};

    public static void checkAvailability(String bookTitle){
        for(String i: books){
            if(bookTitle.equals(i)){
                System.out.println("Book is present in library!\nChecking if its borrowed...");
                borrowBook(bookTitle);
                return;
            }
        }

        System.out.println("Book is not available!");
    } 

    public static void borrowBook(String bookTitle){
        for(String i: borrowedBooks){
            if(i.equals(bookTitle))
            {
                System.out.println("Sorry book is borrowed!");
                return;
            }
        }

        System.out.println("Book is available!");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String bookTitle = sc.nextLine();
        checkAvailability(bookTitle);
    }
}
