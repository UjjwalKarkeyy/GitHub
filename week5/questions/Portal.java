package week5.questions;

class StudentManageSys {

    private String name;
    private int rollno, marks;

    void getMarks(){

        System.out.println("Marks: " + this.marks);
    }

    private void setMarks(int marks){
        
        if(marks >= 0 && marks <= 100)
            this.marks = marks;

        else
            System.out.println("Invalid marks!");
    }

    void updateMarks(int marks){
        setMarks(marks);
    }
}

class Student{

    StudentManageSys s1 = new StudentManageSys();

    public void viewMarks(){

        s1.getMarks();
    }
}

class Teacher{

    StudentManageSys s1 = new StudentManageSys();

    public void viewMarks(){

        s1.getMarks();
    } 

    public void setMarks(int mark){
        s1.updateMarks(mark);
    }
}

public class Portal{
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        t1.setMarks(100);   
        t1.viewMarks();   
    }
}
