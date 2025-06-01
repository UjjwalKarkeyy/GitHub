package week5.questions;

public class CarClass {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Lambo";
        car1.model = "Aventador";
        car1.year = 2005;
        car1.price = 300000;

        car2.brand = "Bugatti";
        car2.model = "Veron";
        car2.year = 2023;
        car2.price = 500000;

        Car[] carArray = new Car[2];

        carArray[0] = new Car(car1);
        carArray[1] = new Car(car2);

        int count = 1;
        for(Car i: carArray)
        {
            System.out.println("\nCar " + count);
            count++;
            System.out.println("Brand: " + i.brand);
            System.out.println("Model: " + i.model);
            System.out.println("Year: " + i.year);
            System.out.println("Price: " + i.price);
        }
    }
    
}

class Car
{
    String brand, model;
    int year;
    float price;

    Car()
    {

    }

    // Copy constructor
    Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.price = other.price;
    }
}
