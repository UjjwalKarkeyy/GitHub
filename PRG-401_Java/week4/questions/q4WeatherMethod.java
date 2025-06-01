package week4.questions;
import java.util.Scanner;

public class q4WeatherMethod {
    
    static double temperature;
    static String Unit, weatherCondition;
    static boolean runState = true;

    public static void convertTemperature(double temp, String unit)
    {
        if(unit.equals("c"))
        {
            temperature = (temp * 9/5) + 32;
            Unit = "f";
        }
        
        else if(unit.equals("f"))
        {
            temperature = (temp - 32) * 5/9;
            Unit = "c";
        }

        else
        {
            runState = false;
            System.out.println("Invalid temperature unit!");
        }
    }

    public static void getWeatherAdvice(double temp, String weatherCondition)
    {   
        switch (weatherCondition) 
        {
            case "hot":
                System.out.println("Wear light t-shirts and shorts!");
                break;
            case "cold":
                System.out.println("Wear sweaters and warm pants!");
                
            case "normal":
                System.out.println("Wear anything normal!");

            default:
                break;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit (f = fahrenheit, c = celsius): ");
        Unit = sc.nextLine();
        System.out.println("Enter the temperature: ");
        temperature = sc.nextDouble();
        convertTemperature(temperature, Unit.toLowerCase());

        if(runState)
        {
            System.out.println("Temperature is: " + temperature + Unit);

            if( (temperature > 97 && Unit.equals("f")) || (temperature > 38 && Unit.equals("c")))
            {
                weatherCondition = "hot";
            }

            else if( (temperature < 97 && temperature > 32 && Unit.equals("f")) || (temperature < 38 && temperature > 20 && Unit.equals("c")))
            {
            weatherCondition = "normal";
            }

            else
                weatherCondition = "cold";

            getWeatherAdvice(temperature, weatherCondition);
        }
    }
}
