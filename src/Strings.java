import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
//        The length of String

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String greeting = "Hello dear";

        System.out.println("The length of txt is " + txt.length());
        System.out.println(greeting.toUpperCase());//toUpperCase() method for string

        /*String concatenation*/
        String fname = "John";
        String lname = "Doe";
        System.out.println("Your full name is " + fname + " " + lname);

//        You can also use the concat() method to join two strings together.
        System.out.println("Your full name is " + fname.concat(lname));

//        Escape characters
        String statement = "It is not good to use the word \"fuck\" in a staement ";
        System.out.println(statement);
    }
}
