package week4.questions;

public class q1TotalCost 
{

    public static double calculateTotal(double[] vals)
    {   
        double sum = 0;
        for(double i: vals)
        {
            sum += i;
        }

        if(sum > 1000)
            sum -= (0.2 * sum);

        else if(sum > 600)
            sum -= (0.1 * sum);

        return sum;
    }
    public static void main(String[] args) 
    {
        double[] price = {98.6,43.5,333.6,89.7};

        System.out.println("Total price is: " + calculateTotal(price));
    }
}
