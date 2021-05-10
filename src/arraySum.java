import java.util.Scanner;

public class arraySum {

    /*public void addArray(int arraySize)
    {
        Scanner sc = new Scanner(System.in);

    }*/
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;
        int[] outputArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }
        System.out.println("#########################################################");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            outputArray[i] = sum;
            System.out.println(outputArray[i]);
        }

    }

}
