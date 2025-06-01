package week3.questions;

public class q13ReverseString {
    public static void main(String[] args) {
        String name = "JavaProgramming";

        for(int i = 0; i < name.length(); i++)
        {
            System.out.print(name.charAt(name.length()-1-i));
        }

        System.out.println();
    }
}
