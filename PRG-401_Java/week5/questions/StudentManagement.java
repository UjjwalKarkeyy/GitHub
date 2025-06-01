package week5.questions;

public class StudentManagement {
    public static void main(String[] args) {
        ManageStu stu1 = new ManageStu();

        stu1.grade = "A+";
        stu1.name = "Ujjwal";
        stu1.rollNumber = 40;
        stu1.marks = 95;
        stu1.displayDetails();
    }
}

class ManageStu
{
    String name, grade;
    int rollNumber;
    float marks;

    public void displayDetails()
    {
        System.out.println("\nName: " + this.name + "\nGrade: " + this.grade + "\nRoll Number: " + this.rollNumber + "\nMarks: " + this.marks + "\nGrade: " + this.grade);
    }
}
