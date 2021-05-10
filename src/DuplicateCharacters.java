public class DuplicateCharacters {
    public static String duplicateString(String inputString)
    {
        //JAVA
        String outputString = "";
        char strTemp;
        int counter;
        char[] characters = inputString.toCharArray();
        for(int i = 0; i < characters.length;i++)
        {
            counter = 0;
            strTemp = characters[i];
            for(int j = 0; j < characters.length;j++)
            {
                char temp = characters[j];
                if(strTemp == temp)
                {
                    counter = counter + 1;
                }
            }
            System.out.println(strTemp+" = "+counter);

        }
        return inputString;
    }

    public static void main(String[] args) {

        duplicateString("Java");
    }
}
