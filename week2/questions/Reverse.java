package week2.questions;

public class Reverse {
    public static void main(String[] args) {
        String str = "JavaProgramming";

        for(int i = (str.length() - 1); i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
