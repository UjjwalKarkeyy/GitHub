package week4;

public class JavaRecursion {
    
    public static int sum(int num)
    {
        // sum 1 to 10
        if(num > 0)
        {
            return (num + sum(num - 1));
        }

        else
            return 0;
    }

    public static int factorial(int num)
    {
        if(num > 0)
        {
            return num * factorial(num - 1);  // 1 * 1 = 2 * 1 = 3 * 2 = 4 * 6 = 5 * 24 = 120
        }

        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println("Sum is: " + sum(10));
        System.out.println("Factorial is: " + factorial(5));
    }
}
