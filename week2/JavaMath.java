package week2;

public class JavaMath 
{
    public static void main(String[] args) 
    {
        System.out.println(Math.min(2,6));
        System.out.println(Math.max(2,6));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.random());

        // 1 to 10 random number generator
        int randomNumber = (int)(Math.random() * 11);
        System.out.println(randomNumber);
    }
}
