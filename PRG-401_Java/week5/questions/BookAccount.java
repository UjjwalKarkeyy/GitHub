package week5.questions;

public class BookAccount{
    
    String title, author;
    double price;
    int ISBN;

    public static void main(String[] args) {
        BookAccount book1 = new BookAccount();
        BookAccount book2 = new BookAccount();
        book1.title = "Harry Potter";
        book1.author = "J.K. Rowling";
        book1.price = 20.99;
        book1.ISBN = 123456789;

        book2.title = "Harry Potter";
        book2.author = "J.K. Rowling";
        book2.price = 20.99;
        book2.ISBN = 123456789;

        System.out.println("\nBook 1: \nTitle: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Price: " + book1.price);
        System.out.println("ISBN: " + book1.ISBN);

        System.out.println("\nBook 2: \nTitle: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Price: " + book2.price);
        System.out.println("ISBN: " + book2.ISBN);
    }
}
