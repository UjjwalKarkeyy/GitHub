package week5.Polymorphism;

class Shape{
    void printInfo(){
        System.out.println("This is shape from shape!");
    }
}

class Triangle extends Shape{

    double h;

    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("This is shape from triangle!");
    }
}

public class PolyEx {
    
    void area(int l, int b){

    }
    
    void area(double l, int b){

    }
    
    public static void main(String[] args) {
        
        PolyEx p1 = new PolyEx();

        p1.area(1, 2);
        p1.area(1.5, 2);

        Shape t= new Triangle();

        t.printInfo();

        Triangle t1 = new Triangle();
        // t1.printInfo();
    }    
}
