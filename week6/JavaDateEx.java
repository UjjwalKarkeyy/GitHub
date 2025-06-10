package week6;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaDateEx {
   public static void main(String[] args) {
    
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    System.out.println("Today's date is: " + currentDate);
    System.out.println("Current time is: " + currentTime);
    System.out.println("Local date time (before format): " + localDateTime);
    String formattedDate = localDateTime.format(formatter);
    System.out.println("Local date time (after format): " + formattedDate);
   } 
}  
