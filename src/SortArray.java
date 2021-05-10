// A sample Java program to sort an array of integers
// using Arrays.sort(). It by default sorts in
// ascending order
import java.util.Arrays;
import java.util.Collections;

public class SortArray
{
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        Integer[] arr = {13, 7, 6, 45,9,8,21, 101, 102};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}