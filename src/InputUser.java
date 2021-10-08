import java.util.Scanner;


public class InputUser {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please give number to A");
//        System.out.println("Please give number to B");

        String username = myObj.nextLine();
        int a = myObj.nextInt();

        System.out.println("Please give number to B");
        int b = myObj.nextInt();


//        System.out.println("Your username is " + username);
        System.out.println(a + b);

    }

}
