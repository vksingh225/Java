
import java.util.HashMap;
import java.util.Map;

/* Return index of the two elements whose sum matches
    the target. Elements cannot repeat.
*/
public class TwoSum {
    public static void main(String[] args) {
        int [] input = {3,2,4};

        
        int[] result = twoSum(input , 6);
        for(int i=0 ; i<result.length ; i++){
            System.out.println(result[i]);
        }
    }

    private static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i < array.length ; i++) {
            int temp = target -  array[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i};
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}