package week5;

public class MainClgStu {
    public static void main(String[] args) {
        CollegeStudent c1 = new CollegeStudent();

        c1.setName("Ujjwal");
        c1.setAge(22);
        c1.setRoll(40);
        System.out.println("Name: " + c1.getName());
        System.out.println("Age: " + c1.getAge());
        System.out.println("Roll no: " + c1.getRoll());
    }
}
