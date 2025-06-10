package week6.questions;

interface Vehicle{

    void start();
    void stop();
}

class Car implements Vehicle{

    @Override
    public void start(){
        System.out.println("Start the car!");
    }

    @Override
    public void stop(){
        System.out.println("Stop the car!");
    }
}

class Bike implements Vehicle{

    @Override
    public void start(){
        System.out.println("Start the bike!");
    }

    @Override
    public void stop(){
        System.out.println("Stop the bike!");
    }
}

public class VehicleManageSys {
   public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();
    
        c1.start();
        c1.stop();
        b1.start();
        b1.stop();
   } 

}
