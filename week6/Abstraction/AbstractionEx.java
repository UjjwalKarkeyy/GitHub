package week6.Abstraction;

abstract class User{        // You can't create objects of Abstract class

    abstract void login();  // Abstract method
    void detail(){          // Concrete method
        System.out.println("User Detail");
    }
}

class Admin extends User{

    @Override
    void login(){
        System.out.println("Admin Logged In!");
    }
}

class SuperAdmin extends User{
    @Override
    void login(){
        System.out.println("Super admin Logged In!");
    }
}

public class AbstractionEx {
    public static void main(String[] args) {
    
        User a1 = new Admin();          // Taking parent class reference to create the object using child class constructor
        User sa1 = new SuperAdmin();
        a1.login();
        sa1.login();
    }
}


