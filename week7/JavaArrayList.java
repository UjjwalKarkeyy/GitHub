package week7;
import java.util.ArrayList;

// JAVA COLLECTION
/*
    Java Collection is a collection of various data structure algorithms created by Java itself. It has interfaces, but as you know interfaces
    can't be inherited by any class which is why we have classes like ArrayList which helps to implement these interfaces. Also, as you are only
    working with classes we can't just define the data type for these classes as say 'int'. Instead we use classes for defining data type as well
    which we call 'Wrappers'
*/

public class JavaArrayList{
    public static void main(String[] args) {
        // Default is size 10. Any beyond 10, the array starts resizing itself.
        ArrayList<Integer> numbers = new ArrayList<>(15); // We can pass an argument to constructor to initialize its size like 15
        
        // We can also do the above line as:
        // List<Integer> numList = new ArrayList<>();

        // (oldCapacity >> 1, can also be understood as oldCapacity / 2. We use bitwise op as it is faster than arithmetic like oldCapacity/2)
        // newCapacity = oldCapacity + oldCapacity >> 1 
        // newCapacity = 15 + 15 / 2 => 15 + 7 => 22 

        // Using Java Collection Methods
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.remove(0); // Passing index as argument
        numbers.set(1, 100); // (index place, value to set)

        // We can also do
        numbers.add(2, 200); // Goes to index 2, places 200 there but shifts the val in that indx to the right

        // Dynamically adding values to the ArrayList
        for(int i = 10; i <= 20; i++){
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println("Indexing an element: " + numbers.get(2));
        System.out.println("If a num is present: " + numbers.contains(100));
        System.out.println("Size of array list: " + numbers.size());

        System.out.println("Using for each:\n");
        for(int i: numbers){
            System.out.println(i);
        }
    }
}