package week7.questions;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class q2ContactApp{

    LinkedList<String>phNumber = new LinkedList<>(Arrays.asList("9824097004", "9815734100"));
    LinkedList<String>contactName = new LinkedList<>(Arrays.asList("Ujjwal", "Karki"));

    void searchContact(String name){

        if(contactName.contains(name)){

            int indx = contactName.indexOf(name);
            System.out.println("Contact Name: " + phNumber.get(indx));
        }

        else{
            System.out.println("Not in the list!");
        }
    }

    void displayContacts(){
        System.out.println(phNumber);
    }

    public static void main(String[] args){

        q2ContactApp q2 = new q2ContactApp();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        q2.searchContact(name);
    }
}
