package week3.questions;
import java.util.Scanner;

public class q16FibonacciFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, prev = 0, curr = 1;
        System.out.print(prev + " " + curr + " ");

        for(int i = 2; i < num; i++)
        {
            sum += (prev + curr);
            System.out.print(sum + " ");
            prev = curr;
            curr = sum;
            sum = 0;
        }

        System.out.println();
    }
}
