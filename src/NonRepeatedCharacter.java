import java.util.HashMap;
import java.util.Locale;

public class NonRepeatedCharacter {
    public String nonRepeated(String str) {
        /*int counter;
        String result = "";
        String inputString = str.toLowerCase();
        //char[] characters = str.toCharArray();
        for(int i = 0; i < inputString.length();i++){
            counter = 0;
            for(int j = 0; j<inputString.length();j++)
            {
                if (inputString.charAt(i) == inputString.charAt(j) && i != j) {
                    counter++;
                }
            }
            if(counter == 0)
            {
                result =  String.valueOf(inputString.charAt(i));
                break;
            }

        }
        return result;*/
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result = String.valueOf(str.charAt(i));
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NonRepeatedCharacter n = new NonRepeatedCharacter();
        String result = n.nonRepeated("nishant");
        System.out.println("The first non repeated character in the String is "+ result);

    }


}
