public class RomanToInteger {
    public int romanNumber(String romanNumber) {
        int romanOutput = 0;
        int tempNumber = 0;
        int outputNumber = 0;
        char[] value = romanNumber.toCharArray();
        for (int i = 0; i < value.length; i++) {
            //value =Integer
            switch (value[i]) {
                case 'I':
                    romanOutput = 1;
                    break;
                case 'V':
                    romanOutput = 5;
                    break;
                case 'X':
                    romanOutput = 10;
                    break;
                case 'L':
                    romanOutput = 50;
                    break;
                case 'C':
                    romanOutput = 100;
                    break;
                case 'D':
                    romanOutput = 500;
                    break;
                case 'M':
                    romanOutput = 1000;
                    break;
            }
            if(i == 0)
            {
                outputNumber = romanOutput;
                tempNumber = romanOutput;
            }
            else if(romanOutput > tempNumber) {
                romanOutput = romanOutput - (2*tempNumber);
                tempNumber = romanOutput + (2*tempNumber);
                outputNumber = outputNumber + romanOutput;
            }
            else
            {
                tempNumber = romanOutput;
                outputNumber = outputNumber + romanOutput;
            }

        }
        return outputNumber;
    }

    public static void main(String[] args) {

        RomanToInteger number = new RomanToInteger();
        System.out.println(number.romanNumber("XLIX"));

    }
}
