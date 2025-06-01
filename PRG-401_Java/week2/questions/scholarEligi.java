package week2.questions;
import java.util.Scanner;

public class scholarEligi {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GPA: ");
        float gpa = sc.nextFloat();

        if(gpa < 3.0)
            System.out.println("Not Eligible for Scholarship");

        else if(gpa >= 3.0 && gpa <= 3.49)
            System.out.println("Eligible for Partial Scholarship");

        else
            System.out.println("Eligible for Full Scholarship");
    }
}
