public class TrimSpace {

    public void removeWhiteSpace(String str)
    {
        char[] strToChar = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strToChar.length ; i++) {
            if(strToChar[i]!=' ')
            {
                sb.append(strToChar[i]);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        TrimSpace tS = new TrimSpace();
        tS.removeWhiteSpace("My Name Is Kunal");
    }
}
