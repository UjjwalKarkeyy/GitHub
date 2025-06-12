package week7.questions;
import java.util.ArrayList;
import java.util.Scanner;

public class q1GroceryList{
    
    ArrayList<String> groceryList = new ArrayList<>();

    void addItem(Scanner sc){
        String items;
        System.out.println("Enter the number of items: ");
        int num = sc.nextInt();
        System.out.println("Enter the list of items: ");
        sc.nextLine();

        for(int i = 0; i < num; i++){
            items = sc.nextLine();
            this.groceryList.add(items);
        }
    }

    void removeItem(Scanner sc){

        System.out.println("Enter the item to remove: ");
        sc.nextLine();
        String itemRemove = sc.nextLine();
        if(this.groceryList.contains(itemRemove)){
            this.groceryList.remove(itemRemove);
        }

        else{
            System.out.println("Item is not present in the list!");
        }
    }

    void displayList(){
        if(this.groceryList.size() != 0){

            System.out.println("List is: ");
            System.out.println(this.groceryList);
        }

        else{
            System.out.println("No items in the list to display!");
        }
    }

    public static void main(String[] args) {
        
        q1GroceryList u1 = new q1GroceryList();
        boolean state = true;
        Scanner sc = new Scanner(System.in);

        while(state){
            System.out.println("Options:\n1. Add\n2. Remove\n3. Display List\n(Press Any Key to Exit)");
            int option = sc.nextInt();
        
            switch (option) {
                case 1:
                    u1.addItem(sc);
                    break;
                case 2:
                    u1.removeItem(sc);
                    break;

                case 3:
                    u1.displayList();
                    break;

                default:
                    System.out.println("Bye Bye!");
                    state = false;                
                    break;
            }
        }
    }
}