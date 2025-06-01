package week4.questions;
import java.util.Scanner;

public class q9StudentGrade{

    final static String[] subjects = {"English", "Nepali", "Math", "Computer"};
    static double[] marks = new double[subjects.length];

    public void gradeCalculator(){
        
        Scanner sc = new Scanner(System.in);
        double avg, sum = 0;
        int count = 0;
        String grade;

        for(String sub: subjects){

            System.out.println("Enter marks(in 100) for " + sub);
            marks[count] = sc.nextDouble();
            sum += marks[count];
            count++;
        }
        avg = sum / subjects.length;

        if(sum <= 32)
            grade = "D";

        else if(sum >= 33 && sum <= 39)
            grade = "D+";

        else if(sum >= 40 && sum <= 49)
            grade = "C";

        else if(sum >= 50 && sum <= 59)
            grade = "C+";

        else if(sum >= 60 && sum <= 69)
            grade = "B";

        else if(sum >= 70 && sum <= 79)
            grade = "B+";

        else if(sum >= 80 && sum <= 89)
            grade = "A";

        else
            grade = "A+";

        printResult(marks, avg, grade);
    }

    public static void printResult(double[] marks, double avg, String grade){
        System.out.println("\n-------------------------------");
        System.out.println("         Report Card           ");
        System.out.println("-------------------------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-10s: %.2f\n", subjects[i], marks[i]);
        }

        System.out.println("-------------------------------");
        System.out.printf("Average   : %.2f\n", avg);
        System.out.printf("Grade     : %s\n", grade);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        q9StudentGrade s1 = new q9StudentGrade();

        s1.gradeCalculator();
    }
}