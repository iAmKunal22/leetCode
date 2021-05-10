public class ReverseString {

    public static String reverse( String inputString)
    {
        String stringReverse = "";
        char[] characters = inputString.toCharArray();
        int i;
        for(i = characters.length-1; i>=0; i--)
        {
            stringReverse = stringReverse + characters[i];
        }
        return stringReverse;
    }
    public static void main(String[] args) {

        String outputString = reverse("Kunal");
        System.out.print(outputString);

    }
}
