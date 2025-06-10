package week1;

public class JavaCondition {
    public static void main(String[] args) {
        int age = 18;
        if(age >= 16)
        {
            System.out.println("Eligible");
        }

        else
        {
            System.out.println("Not eligible");
        }
        int day = 2;
        if(day == 1)
            System.out.println("Sunday");
        else if(day == 2)
            System.out.println("Monday");
        else if(day == 3)
            System.out.println("Tuesday");
        else
            System.out.println("Some other day");
    }
}
