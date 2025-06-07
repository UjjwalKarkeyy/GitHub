package week5;

public class CreatingConstructor {
      int x;  // Creating a class attribute

  // Creating a class constructor for the CreatingConstructor class
  public CreatingConstructor() {
    x = 5;  // Setting the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Creating an object of class. This will also call the constructor
    System.out.println(myObj.x); // Printing the value of x
  }
}
