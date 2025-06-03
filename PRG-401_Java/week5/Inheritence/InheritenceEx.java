package week5.Inheritence;

/*
    - Types of Inheritance:
        1. Single Inheritance: Only one child and one parent
        2. Multilevel Inheritance: A (parent) is extended by B and B is extended by C
        3. Heirarchical: Multiple subclass extend the same parent class
        4. Hybrid: Mix of all

    - We can use final keyword in class to not let other extend from it or use it in methods so subclass can't override it.
 */


class Animal{
    String color;

    void eat(){
        System.out.println("Animal eat!");
    }

    void canNotExtend(){
        System.out.println("Hello, I can't be extended!");
    }

    Animal(String color){
        this.color = color;
    }

    Animal(){

    }
}

class Dog extends Animal{

    int age;

    Dog(String color, int age){
        super(color); //  Calls the parent's constructor
        this.age = age;   
    }

    Dog(){

    }

    void iCantExtend(){
        super.canNotExtend();
    }
    
    void bark(){
        System.out.println("Dog barks!");
    }

    // Use the parent function, but change it's functionality (Method Overloading)
    @Override // Polymorphism
    void eat(){
        System.out.println("Dog eat");
    }
}

class Bulldog extends Dog{
    Bulldog(){
        super("Brown", 3);
    }
}

class GoldenRetriever extends Dog{
    GoldenRetriever(){
        super("Golden Brown", 1);
    }
}

public class InheritenceEx{
    public static void main(String[] args) {
        Dog d1 = new Dog("Black", 1);
        d1.eat();

        d1.color = "Red";
        System.out.println(d1.color);
        d1.bark();
        d1.iCantExtend();

        Bulldog b1 = new Bulldog();
        System.out.println("Bulldog calls:");
        b1.eat();

        GoldenRetriever g1 = new GoldenRetriever();
        System.out.println("Golden retrever's color is: " + g1.color);
        
    }
}