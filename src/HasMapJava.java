import java.util.HashMap;

public class HasMapJava {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String,String>();

        capitalCities.put("Lagos", "Ikeja");
        capitalCities.put("Oyo", "Ibadan");
        capitalCities.put("Osun", "Oshogbo");
        capitalCities.put("Bauchi", "Bauchi");
        capitalCities.put("Benue", "Makurdi");

//        System.out.println(capitalCities.get("Osun"));//to access an item
        /*Looping through HashMap*/
            //To get the keys
//        System.out.println("These are the States");
        for (String state: capitalCities.keySet()) {
            System.out.println("State:" + state + ", Capital:" + capitalCities.get(state));
        }
        //To get the values
//        System.out.println("These are the Capitals");
        for (String capital: capitalCities.values()) {
//            System.out.println(capital);
        }

    }
}
