import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapProg {
    public static String duplicateString(String inputString) {
        HashMap<Character, Integer> map = new HashMap<>();
        String outputString = "";
        int counter;
        char[] characters = inputString.toCharArray();
        for (char character : characters) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        //    System.out.println(strTemp.getKey() + " " + strTemp.getValue());
        return map.toString();

    }


    //return inputString;

    public static void main(String[] args) {

       // duplicateString("Java");
        System.out.println(duplicateString("Java"));
    }
}

