package week6.questions;

enum role{
    ADMIN,
    MODERATOR,
    USER,
    GUEST,
}

public class EnumWebApp {

    public static void greetAdmin(){
        System.out.println("Hello Admin!");
    }
    public static void greetMod(){
        System.out.println("Hello Moderator!");
        
    }
    public static void greetUser(){
        System.out.println("Hello User!");
        
    }
    public static void greetGuest(){
        System.out.println("Hello Guest!");
    }

    public static void main(String[] args) {
        
        role val = role.ADMIN;

        switch (val) {
            case ADMIN -> greetAdmin();
            case MODERATOR -> greetMod();
            case USER -> greetUser();
            case GUEST -> greetGuest();
        }
    }
}
