import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] output = ts.getArraySum(new int[]{1,2,3,5,6},7);
        System.out.println(output[0] +","+output[1]);
    }
    public int[] getArraySum(int[] inputArray, int target)
    {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            map.put(inputArray[i], i);
        }
        for (int i = 0; i < inputArray.length; i++) {
            int numToTarget = target - inputArray[i];
            if(map.containsKey(numToTarget)){
                return new int[] {i,map.get(numToTarget)};
            }
            map.put(inputArray[i],i);
        }
        System.out.println("");
        return new int [] {-1,-1};
    }
}
