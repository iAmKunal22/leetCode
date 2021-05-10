import java.util.HashMap;
import java.util.Map;

public class Temp {

    // Main driver method
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, String> foodTable
                = new HashMap<String, String>();

        // Inserting elements to the abobe HashMap
        // Elements- Key value pairs using put() method
        foodTable.put("A", "Angular");
        foodTable.put("J", "Java");
        foodTable.put("P", "Python");
        foodTable.put("H", "Hibernate");

        // Iterating HashMap through for loop
        for (Map.Entry<String, String> set :
                foodTable.entrySet()) {

            // Printing all elemnts of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
    }
}
