import java.util.HashSet;
import java.util.Set;

public class DuplicateElementFromAnArray {

    public void findDuplicateElement(int[] array)
    {
        Set<Integer> element = new HashSet<>();
        for (Integer number:array) {
            if (!element.add(number)){
                System.out.println("Duplicate element found " + number);
            }
            
        }
    }

    public static void main(String[] args) {
        DuplicateElementFromAnArray dupElement = new DuplicateElementFromAnArray();
        dupElement.findDuplicateElement(new int [] {10,5,10,34,24,15,24} );
    }
}
