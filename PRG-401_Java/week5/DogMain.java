package week5;

// Three types of constructor: Parameterized, non-parameterized, copy constructors

class Dog
{
    String color, breed;
    int size, age;

    public void run()
    {

    }
    public void eat()
    {

    }
    public void printInfo()
    {
        System.out.println("Color: " + this.color + "\nBreed: " + this.breed + "\nAge: " + this.age + "\nSize: " + this.size + "\n");
    }

    Dog()  // Non-parameterized constructor
    {

    }

    Dog(String color, int age, int size, String breed)
    {
        this.color = color;  // Here this keyword helps to know the difference between the function variable and the class variable/attribute
        this.age = age;
        this.size = size;
        this.breed = breed;

    }

    Dog(Dog dog)  // Copy constructor
    {
        this.color = dog.color;  
        this.age = dog.age;
        this.size = dog.size;
        this.breed = dog.breed;
    }
}

public class DogMain
{
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.color = "blue";
        dog1.breed = "German Shepherd";
        dog1.age = 9;
        dog1.size = 5;
        dog1.printInfo();

        Dog dog2 = new Dog("black", 2, 4, "Labrador");
        dog2.printInfo();

        Dog dog3 = new Dog();

        dog3.color = "white";
        dog3.breed = "Husky";
        dog3.age = 3;
        dog3.size = 7;
        dog3.printInfo();

        Dog dog4 = new Dog(dog2);
        dog4.printInfo();

        System.out.println();
    }
}
