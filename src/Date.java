import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Date {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate = myDate.format(myTimeFormat);

        System.out.println("Today's date is " + myDate);
        System.out.println("Today's date after formatting " + formattedDate);
        System.out.println("The current time is " + myTime);

    }
}
