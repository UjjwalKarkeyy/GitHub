package week5.questions;

public class StudentClass {

    String name, grade;
    int rollno;
    double marks;

    void displayDetails(String name, String grade, int rollno, double marks){
        System.out.println("\nName: "+ name);
        System.out.println("Grade: "+ grade);
        System.out.println("Roll No: "+ rollno);
        System.out.println("Marks: "+ marks);
    }

    public static void main(String[] args) {
        
        StudentClass s1 = new StudentClass();
        StudentClass s2 = new StudentClass();
        StudentClass s3 = new StudentClass();

        s1.name = "Ujjwal";
        s1.grade = "A+";
        s1.rollno = 40;
        s1.marks = 96;

        s2.name = "Saurav";
        s2.grade = "F";
        s2.rollno = 20;
        s2.marks = 23;
        
        s3.name = "Aashray";
        s3.grade = "A+";
        s3.rollno = 10;
        s3.marks = 95;

        s1.displayDetails(s1.name, s1.grade, s1.rollno, s1.marks);
        s2.displayDetails(s2.name, s2.grade, s2.rollno, s2.marks);
        s3.displayDetails(s3.name, s3.grade, s3.rollno, s3.marks);

    }
}
