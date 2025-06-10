package week5.questions;

class EmployeeDetails{

    String empName;
    private double salary = 10000;

    public double getSalary(){
        return salary;
    }

    void setSalary(double salary, int param_id, int param_pass){
            int[] id = {1001, 1002, 1003};
            int[] pass = {401, 375, 654};
            boolean access = false;

            for(int i: id){
                if(i == param_id){
                    for(int p: pass){
                        if(p == param_pass){
                            access = true;
                            this.salary = salary;
                            break;
                        }
                    }
                break;
                }
            }
            if(!access)
                System.out.println("Access Denied!");

            else
                System.out.println("New salary set!");
    }
}

// Public class for HR Department
public class HREmployeeManagement{
    
    public static void main(String[] args) {
        
        EmployeeDetails e1 = new EmployeeDetails();

        e1.empName = "Ujjwal";
        e1.getSalary();
        e1.setSalary(100000, 1001, 401);
    }
}
