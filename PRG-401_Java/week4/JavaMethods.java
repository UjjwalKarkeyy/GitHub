package week4;

public class JavaMethods { 

    public static void printInfo()
    {
        System.out.println("Hello there!");
    }

    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        printInfo();
        System.out.println("Sum is: " + sum(2,3));
    }   
}
