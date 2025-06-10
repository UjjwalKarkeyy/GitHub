package week4.questions;
import java.util.Scanner;

public class q5FitnessTrackerMethod {

    final static double caloriesPerStep = 0.04, stWeight = 70;

    public static double calculateCaloriesBurned(int steps, double weight)
    {
        return (steps * weight * caloriesPerStep/stWeight);
    }

    public static void suggestWorkoutPlan(int age, double BMI)
    {
        if(BMI < 18.5)
        {
            System.out.println("You are underweight, please focus on diet!");
        }

        else if(BMI >= 18.5 && BMI <= 24.9)
        {
            System.out.println("Lunges, pushups, squats, dumbbell rows");
        }
        
        else if(BMI >= 25.0 && BMI <= 29.9)
        {
            System.out.println("Bicep curl, dance, walking, cycling");
        }
        else if(BMI >= 30.0 && BMI <= 34.9)
        {
            System.out.println("walking, swimming, and cycling, gradually increasing intensity and duration");
        }

        else
        {
            System.out.println("You are extreme obese. Please consult a doctor!");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, steps;
        double BMI, wt;

        System.out.println("Enter your age: ");
        age = sc.nextInt();
        
        System.out.println("Enter your weight: ");
        wt = sc.nextDouble();
        
        System.out.println("Enter your BMI: ");
        BMI = sc.nextDouble();
        
        System.out.println("Enter your steps: ");
        steps = sc.nextInt();

        System.out.println("Calories burned: " + calculateCaloriesBurned(steps, wt));
        suggestWorkoutPlan(age, BMI);
    }
}
