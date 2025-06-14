package week7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

class Node{
    int data;
    Node next;
}

public class JavaLinkedList{

    public static void main(String[] args) {
        ArrayList<String> places = new ArrayList<>(Arrays.asList("KTM","Pokhara", "Lalitpur"));
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4,5));
        Collections.sort(places);
        Collections.sort(nums, Collections.reverseOrder());
        // places.remove("KTM");
        // nums.remove(2);  // Takes in index
        // nums.remove(Integer.valueOf(2));  // Takes in value with the help of wrapper class
        System.out.println(places);
        System.out.println(nums);

        // HOW NODES WORK UNDER THE HOOD:

        // Node n1 = new Node();
        // Node n2 = new Node();
        // Node n3 = new Node();
        // n1.data = 10;   
        // n1.next = n2;
        // n2.data = 20;   
        // n2.next = n3;
        // n3.data = 15;   
        // n3.next = null;

        LinkedList<String> animals = new LinkedList<>();
        LinkedList<Integer> values = new LinkedList<>(Arrays.asList(20,30,40,7,9));
        LinkedList<String> removeAnimals = new LinkedList<>(Arrays.asList("Panda", "Tiger", "Lion", "Unicorn"));
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bull");
        animals.add("Lion");
        animals.addFirst("Human");
        animals.addLast("Elephant");
        System.out.println(animals.get(2)); // Time complexity: O(n)
        // System.out.println(animals.remove("Human"));
        System.out.println(animals);
        animals.removeAll(removeAnimals);
        System.out.println(animals);
        System.out.println(values);
        values.removeIf(x -> x % 2 == 0);
        System.out.println(values);

    }
}