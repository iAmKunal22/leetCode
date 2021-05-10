
public class StringSpecial {



    public void splitString(String str)
    {
        /*StringBuffer alpha = new StringBuffer();
        StringBuffer special = new StringBuffer();
        StringBuffer numeric = new StringBuffer();*/
        String alpha = "";
        String special = "";
        String numeric = "";
        for (int i = 0; str.length() > i; i++) {
            str.charAt(i);
            if(Character.isDigit(str.charAt(i))){
                numeric = numeric + str.charAt(i);
                //numeric.append(str.charAt(i));
            }
            else if(Character.isAlphabetic(str.charAt(i))){
                alpha = alpha + str.charAt(i);
                //alpha.append(str.charAt(i));
            }
            else{
                special = special + str.charAt(i);
                //special.append(str.charAt(i));
            }

        }
        System.out.println(alpha);
        System.out.println(numeric);
        System.out.println(special);
    }

    public static void main(String[] args) {
        StringSpecial splitStr = new StringSpecial();
        splitStr.splitString("23123asdasdasdasfasfas!@#$%^&*");
    }
}
