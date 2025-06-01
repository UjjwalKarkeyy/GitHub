package week2.questions;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) 
    {
        int val, ans;
        int prev = 0;
        int curr = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the val: ");
        val = sc.nextInt();
        
        System.out.println("Fibonacci: ");
        System.out.println(prev);
        System.out.println(curr);
        for(int i = 2; i < val; i++)
        {
            ans = curr + prev;
            System.out.println(ans);
            prev = curr;
            curr = ans;
        }
        System.out.println();
    }
}
