package week6;

class OuterClass{
    int x = 2;

    class InnerClass{
        int y = 3;
    }
}

public class InnerClassEx {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
    }
}
