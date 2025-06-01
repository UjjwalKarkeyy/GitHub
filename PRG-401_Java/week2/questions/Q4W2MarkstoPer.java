package week2.questions;
import java.util.Scanner;

public class Q4W2MarkstoPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int mark = sc.nextInt();

        if(mark < 60)
            System.out.println("F");

        else if(mark >= 60 && mark <=69)
            System.out.println("D");

        else if(mark >= 70 && mark <=79)
            System.out.println("C");
        
        else if(mark >= 80 && mark <=89)
            System.out.println("B");

        else
            System.out.println("A");
    }
}
