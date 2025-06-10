package week1;

public class TypeCastingEx {
    public static void main(String[] args) {
        int clothPrice = 1000;
        int vat = 13;
        int totalPrice = (int)clothPrice + vat; // Explicit typecasting

        System.out.println("Total price is: " + totalPrice);
    }
}
