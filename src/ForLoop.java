public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        /*Example of Java Array */
        String[] cars = {"Toyota", "Range Rover", "Benz", "Ford", "Lexus"};

        /*Foreach for looping through an array*/
        for (String car: cars) {
            System.out.println(car);
        }
    }
}
