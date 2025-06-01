package week2;

public class ForLoopEx {
    public static void main(String[] args) {
        int num = 10;
        boolean isPrime = true;

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println("Prime number");
        }
        
        else
            System.out.println("Not prime number");

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
