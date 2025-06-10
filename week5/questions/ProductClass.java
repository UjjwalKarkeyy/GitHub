package week5.questions;

public class ProductClass {
    
    int productId, stockQuantity;
    String name;
    double price;

    void updateStock(int quantity){

        this.stockQuantity -= quantity;
        System.out.println("New stock quantity is: " + this.stockQuantity);
    }

    public static void main(String[] args) {

        ProductClass p1 = new ProductClass();

        p1.productId = 1;
        p1.name = "Knife";
        p1.stockQuantity = 100;
        p1.price = 100.50;

        p1.updateStock(50);
    }
}
