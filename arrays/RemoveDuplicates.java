import java.util.Set;
import java.util.HashSet;

/* Remove duplicate elements from array and return new array length */
public class RemoveDuplicates {
    public static void main(String args[]) {
        int[] input = {1,1,2,3,3,3,3,4,4,5,5,5};
        int length = getLength(input);
        System.out.println(length);
    }

    public static int getLength(int[] array) {

        Set<Integer> mySet = new HashSet<>();
        for (int t: array) {
            mySet.add(t);
        }
        return mySet.toArray().length;
    }
}