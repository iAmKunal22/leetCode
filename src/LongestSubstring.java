
public class LongestSubstring {
      public String longestPallindrome(String s)
      {
          int strLength = s.length();
          if(strLength <2) {
              return s;
          }
          for (int i = 0; i < strLength-1; i++) {

          }
          return s;
      }

      public  String expandRange(String str, int startPoint, int endPoint)
      {
          while(startPoint >= 0 && endPoint < str.length() && str.charAt(startPoint) == str.charAt(endPoint))
          {

          }
          return str;
      }
}

