package week4.questions;

import java.util.Scanner;

public class EmployeeSalary {

    static int monthlySalary = 50000, monthHr = 230, monthlyHrRate = monthlySalary / monthHr;
    
    public static double calculateSalary(int hrsWorked, double hrRate)
    {
        return calculateBonus(monthlySalary, hrRate, hrsWorked);
    }

     public static double calculateBonus(double salary, double hrRate, int hrsWorked)
     {
        if(hrsWorked > 230)
            salary += ((hrsWorked - 230) * 2000);

        else if(hrsWorked < 230)
            salary -= ((230 - hrsWorked) * hrRate);

        return salary;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter working hours: ");
        int hrsWorked = sc.nextInt();
        System.out.println("Salary is: " + calculateSalary(hrsWorked, monthlyHrRate));
    }

}
