package week3.questions;

public class q10MultiplicationTableWhile {
    public static void main(String[] args) {
        int num = 5, i = 1;

        while(i <= 10)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
