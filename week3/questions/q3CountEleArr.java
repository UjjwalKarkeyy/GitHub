package week3.questions;

public class q3CountEleArr {
    public static void main(String[] args) {
        int[] num = {1,2,3,2,4,2,5};
        int count = 0, countOf = 2;

        for(int i: num)
        {
            if(i == countOf)
            {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
