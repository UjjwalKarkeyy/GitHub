package week2.questions;
import java.util.Scanner;

public class perimeterRect {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        double len = sc.nextDouble();
        System.out.print("Breadth: ");
        double brd = sc.nextDouble();
        
        System.out.println("Perimeter of rectangle is: " + (2 * (len + brd)) );
    }
}
