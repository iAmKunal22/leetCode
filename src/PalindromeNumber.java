public class PalindromeNumber {
    public boolean isPalindrome(int inputNumber)
    {
        int palindromeNumber = 0;
        int userNumber = inputNumber;
        while (userNumber != 0)
        {
            int remainder = userNumber % 10;
            userNumber = userNumber / 10;
            if (palindromeNumber > 2147483647 / 10 || palindromeNumber < -2147483647 / 10) {
                palindromeNumber = 0;
                break;
            } else
                palindromeNumber = (palindromeNumber * 10) + remainder;
        }
        if(palindromeNumber == inputNumber && palindromeNumber >= 0)
        {
          return true;
        }
        else
            return false;
    }
    public static void main(String args[])
    {
        System.out.println(new PalindromeNumber().isPalindrome(-121));
    }

}
