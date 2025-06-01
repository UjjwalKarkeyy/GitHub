package week4;

public class JavaParametrize {

    public static int JavaMul(int a, int b)
    {
        return a*b;
    }

    public static int arraySum(int[] nums)
    {
        int sum = 0;
        for(int val: nums)
        {
            sum += val;
        }

        return sum;
    }
    
    public static void infoCalc(String name ,int... values)   // int[] values. The unique thing is that this throws no error if we don't pass any arguments.
    {
        for(int val: values)
        {
            System.out.println("Running "+ name +" : "+ val);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Multiplication call on 5 and 6 is: " + JavaMul(5, 6));
        System.out.println("Return from arraySum is: "+ arraySum(nums));
        
        System.out.println("Running int... with argument: ");
        infoCalc("Ujjwal",5);
        System.out.println("Running int... without argument: ");
        infoCalc("Ujjwal");
    }


}
