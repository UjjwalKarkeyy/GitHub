package week1;

public class JavaStringEx 
{
    public static void main(String[] args) 
    {
        String name = "Java";
        String name2 = "Java"; // This references the 'name' variable as it also has the same value

        String text = new String("test");
        int number = 34;
        String newText = "This is Java";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        System.out.println(newText.indexOf(" "));

        // Concat

        String fname = "Ujjwal";
        String lname = "Karki";
        System.out.println("Concat:\n"+fname+ " " + lname);

        // comparison

        System.out.println("\nComparison:");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(newText.substring(8));


    }
}
