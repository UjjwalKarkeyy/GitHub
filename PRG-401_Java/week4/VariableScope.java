package week4;

public class VariableScope{
    
    int instance_count = 0; // Instance variable
    static int class_count = 0; // class variable

    static void printInfo()
    {
        // instance_count++; // Can't be used as static refers to class not instance

        class_count++; // Can't be used as static refers to class not instance
    }

    public static void calc(){
        int num = 10; // Local Scope
    }
    
    public static void main(String[] args) {
    }
}