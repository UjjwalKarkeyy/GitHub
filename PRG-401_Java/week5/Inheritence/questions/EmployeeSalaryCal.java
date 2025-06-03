package week5.Inheritence.questions;

class Employee{

    double baseSal = 100000;
    String name;

    Employee(){}
    Employee(String name){
        this.name = name;
    }
}

class Manager extends Employee{

    double bonus = 5000;
    int id = 1;

    Manager(){
        super();
    }

    Manager(String name){
        super(name);
    }

}

class Developer extends Employee{
    
    int numProjects, id = 2;

    Developer(){
        super();
    }

    Developer(String name, int num){
        super(name);
        this.numProjects = num;
    }
}

public class EmployeeSalaryCal {
    
    static void salCalculator(double baseSal, double bonus){

        System.out.println("Salary of manager is: " + (baseSal + bonus));
    }

    static void salCalculator(double baseSal, int numProjects){

        baseSal += (500 * numProjects);

        System.out.println("Salary of developer: " + baseSal);
    }

    public static void main(String[] args) {
        
        Manager m1 = new Manager("Saurav");
        Developer d1 = new Developer("Ujjwal", 10);

        if(m1.id == 1){
            salCalculator(m1.baseSal, m1.bonus);
        }

        if(d1.id == 2){
            salCalculator(d1.baseSal, d1.numProjects);
        }
    }
}
