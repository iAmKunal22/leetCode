public class ReverseSignedInteger {
    public int reverse(int inputNumber) {
        int reversedNumber = 0;
        while (inputNumber != 0) {
            int remainder = inputNumber % 10;
            inputNumber = inputNumber / 10;
            if (reversedNumber > 2147483647 / 10 || reversedNumber < -2147483647 / 10) {
                reversedNumber = 0;
                break;
            } else
                reversedNumber = (reversedNumber * 10) + remainder;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseSignedInteger().reverse(1147483649));
    }
}
