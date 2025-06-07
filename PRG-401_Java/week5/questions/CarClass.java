package week5.questions;

public class CarClass {

    String brand, model;
    int year;
    float price;
    public static void main(String[] args) {

        CarClass c1 = new CarClass();
        CarClass c2 = new CarClass();

        c1.brand = "Lamborghini";
        c1.model = "Aventador";
        c1.year = 2015;
        c1.price = 200000;

        c2.brand = "Lamborghini";
        c2.model = "Urus";
        c2.year = 2019;
        c2.price = 150000;

        System.out.printf("Car 1: \nBrand: %s\nModel: %s\n Year: %d\nPrice: %.2f\n",
                            c1.brand, c1.model, c1.year, c1.price);

        System.out.printf("\nCar 2: \nBrand: %s\nModel: %s\n Year: %d\nPrice: %.2f\n",
                            c2.brand, c2.model, c2.year, c2.price);
    }
}
