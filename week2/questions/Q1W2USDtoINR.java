package week2.questions;
import java.util.Scanner;

public class Q1W2USDtoINR 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter USD value: ");
        float val = sc.nextFloat();
        val = 83 * val;

        System.out.println("Value in INR is: Rs " + val);

    }
}
