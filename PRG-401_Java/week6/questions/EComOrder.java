package week6.questions;

enum role{
    ADMIN,
    USER,
}

class Order{

    int orderId;
    String customerName;
    private double totalAmount;

    Order(){

    }

    Order(int orderId, String cusName, double totalAmount){

        this.orderId = orderId;
        this.customerName = cusName;
        this.totalAmount = totalAmount;
    }

    double calDiscount(){
        double disAmount = (10.0/100) * this.totalAmount;
        System.out.println(disAmount);
        return disAmount;
    }

    private void setAmount(){
        this.totalAmount = this.totalAmount - calDiscount();
    }

    void updateAmount(){
        this.setAmount();
    }

    void getDetails(){
        System.out.println("Order ID: " + this.orderId);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Total Amount: " + this.totalAmount);
    }
}

public class EComOrder {
    public static void main(String[] args) {
        Order order = new Order(101, "Ujjwal", 100000);
        role val = role.ADMIN;

        switch (val) {
            case ADMIN -> order.updateAmount();
            case USER -> order.getDetails();
        }
        order.getDetails();
    }
}
