package week5.questions;

public class EmployeeManagement {
    
    private String empName;
    private double salary = 10000;

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary, boolean state)
    {
        if(state)
        {
            this.salary = salary;
        }

        else
            System.out.println("Access Denied!");
    }


}
