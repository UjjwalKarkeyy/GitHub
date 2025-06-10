package week6.questions;

abstract class Employee{

    abstract void calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee{
        
    @Override
    void calculateSalary(){
        
        System.out.println("Salary is: 10000/month");
    }
    @Override
    void displayDetails(){
        System.out.println("This is full time employee!");
    }
}


class PartTimeEmployee extends Employee{
        
    @Override
    void calculateSalary(){
        
        System.out.println("Salary is: 5000/month");
    }
    @Override
    void displayDetails(){
        System.out.println("This is part time employee!");
    }
}

public class EmpManageSys {
    public static void main(String[] args) {
        
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee();
        PartTimeEmployee partTimeEmp = new PartTimeEmployee();

        fullTimeEmp.calculateSalary();
        fullTimeEmp.displayDetails();
        partTimeEmp.calculateSalary();
        partTimeEmp.displayDetails();
    }
}
