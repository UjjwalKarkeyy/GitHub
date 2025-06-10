package week6.ENUM;

// A special class created just for representing final variables. The variables are public and final
// We can define it either in another file, outside of our main class or even inside of the main class
// These variables inside enum class work as object not as string, or other types.
// Use case: Especially while checking permissions
enum Level{  
    LOW,
    MEDIUM,
    HIGH,
}

public class EnumEx {
    public static void main(String[] args) {
        
        Level val = Level.HIGH;

        // New way of writing switch case where we don't need to mention break
        switch (val) {
            case LOW -> System.out.println("Level low");
            case MEDIUM -> System.out.println("Level medium");
            case HIGH -> System.out.println("Level high");
        }
    }
}
