package week3.questions;

public class q1MaxMinArr {
    public static void main(String[] args) {
        int[] num = {5,12,3,19,8,2};
        int min = num[0];
        int max = min;

        for(int i: num)
        {
            if(min > i)
                min = i;

            if(max < i)
                max = i;
        }

        System.out.println("Max and min are: " + max + " " + min);
    }
}
