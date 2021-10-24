import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Lexus");
        cars.add("Nissan");
        cars.add("Ford");
        cars.add("Benz");

        System.out.println(cars.size());// getting the size of an ArrayList

        Collections.sort(cars);// to sort the cars in alphabetical order

        //looping through an ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }


}
