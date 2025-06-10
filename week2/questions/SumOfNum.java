package week2.questions;

public class SumOfNum {
    public static void main(String[] args) {
        int num = 3456;
        int ans = 0;
        // String rev = "";  // This is not a preferred way to use as this keeps on creating new objects inside the loop so
        
        StringBuilder rev = new StringBuilder(""); // we use string builder which adds value instead of creating new objects

        while(num != 0)
        {
            ans = ans + (num % 10);
            // rev += (num%10);
            rev.append(num%10);
            num /= 10;
        }

        System.out.println("Sum is: " + ans + ". And reverse is: " + rev);
    }
}
