package week4.questions;

import java.util.Scanner;

public class q2RestaurantReserv {

    public static void checkAvailability(String date){

        boolean flag = true;
        String[] reservArr = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"};

        String[] bookedArr = {"2025-01-21","2025-01-23"};
        
        for(String reserv: reservArr)
        {
            if(date.equals(reserv))
            {
                flag = true;
                for(String book: bookedArr)
                {
                    if(date.equals(book))
                    {
                        flag = false;
                        break;
                    }
                }
                break;
            }

            else
                flag = false;
        }

        if(flag)
            System.out.println("Reservation available!");
        
        else
            System.out.println("Sorry, reservation not available!");
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date: ");
        String date = sc.nextLine();

        checkAvailability(date);
    }
}
