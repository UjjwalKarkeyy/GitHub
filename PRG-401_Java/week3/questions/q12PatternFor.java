package week3.questions;

public class q12PatternFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
