package week5.Inheritence.questions;

class Vehicle{

    String brand = "BMW";
    double maxSpeed;

    Vehicle(){}

    Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}

class Cars extends Vehicle{

    int numOfDoors = 4;

    Cars(double maxSpeed){
        super(maxSpeed);
    }

    Cars(){
        super();
    }
}

class Bikes extends Vehicle{

    String handleBar = "metal";

    Bikes(double maxSpeed){
        super(maxSpeed);
    }

    Bikes(){
        super();
    }
}

public class VehicleManageSys {
    
    public static void main(String[] args) {
        Cars c1 = new Cars(100);
        Bikes b1 = new Bikes(110);
        System.out.println(c1.brand);
        System.out.println(c1.maxSpeed);
        System.out.println(b1.brand);
        System.out.println(b1.maxSpeed);        
    }

}
