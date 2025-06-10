package week6.Abstraction;

interface Remote{       // Interface is 100% abstraction

    void pressPower();  // By default all the methods in interface are abstract and public
}

interface Screen {
    void display();
}

class TVRemote implements Remote, Screen{   // Child class and interface we use implements, whereas, interface and say abstraction/interface we use extends
    @Override
    public void pressPower(){
        System.out.println("TV On!");
    }

    @Override
    public void display(){
        System.out.println("Display");
    }
}

public class InterfaceEx {
    
    public static void main(String[] args) {
     
        TVRemote r = new TVRemote();
        r.pressPower();
        r.display();   
    }
}
