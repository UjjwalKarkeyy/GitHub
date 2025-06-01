package week3.questions;
import java.util.Scanner;

public class q6APIHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code: ");
        int code = sc.nextInt();

        switch (code) {
            case 200:
                System.out.println("OK");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Unknown Status");
                break;
        }
    }
}
