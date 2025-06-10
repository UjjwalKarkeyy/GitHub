package week3.questions;

public class q7SumOneTen {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        
        while(i  <= 10)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum from 1 to 10 is: " + sum);
    }
}
