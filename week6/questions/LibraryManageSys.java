package week6.questions;

import java.util.Scanner;

abstract class Book{

    String title, author;
    boolean isAvailable;

    abstract void lendBook();
}

class LendBook extends Book{

    @Override
    void lendBook(){

        boolean isAvailable = true, borrowState = false;

        String[] books = {"Intersteller", "Harry Potter", "Alchemist"};
        String[] borrowedBooks = {"Harry Potter"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String book = sc.nextLine();

        for(String i: books){

            if(i.equals(book)){
                System.out.println("Comparing book: " + i + " and " + book);
                isAvailable = true;
                System.out.println("Checking if it has been borrowed...");
                for(String j: borrowedBooks){
                    if(j.equals(book)){
                        System.out.println("Comparing book: " + j + " and " + book);
                        System.out.println("Sorry, book has already been borrowed!");
                        isAvailable = false;
                        borrowState = true;
                    }
                }

                break;
            }

            else{
                isAvailable = false;
            }
        }

        if(isAvailable){
            System.out.println("Book is available!");
        }

        else if(!borrowState){
            System.out.println("Book is not available!");
        }
    }
}

public class LibraryManageSys {
    
    public static void main(String[] args) {
        
        Book b1 = new LendBook();
        b1.lendBook();
    }
}
