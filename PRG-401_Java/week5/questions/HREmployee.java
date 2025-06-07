package week5.questions;

import java.util.Scanner;

public class HREmployee {
    public static void main(String[] args) {
        boolean state = true;

        EmployeeManagement e1 = new EmployeeManagement();
        System.out.println("Enter new salary: ");
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        e1.setSalary(salary, true);

        System.out.println("Salary is: " + e1.getSalary());
    }
}

