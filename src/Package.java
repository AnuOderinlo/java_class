import java.util.Scanner;



public class Package {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your username");

        String username = userInput.nextLine();
        System.out.println("My username is " + username);
    }
}
