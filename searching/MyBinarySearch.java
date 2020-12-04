
public class MyBinarySearch {
    
    public static void main(String args[]) {
        int [] input = {1,2,3,4,5,6,7,8,9};
        String result = search(input, 1);
        System.out.println(result);
    }

    public static String search(int[] array, int target){

        int start = 0, end = array.length -1;
        int mid = (start + end)/2;
        while (start <= end) {
            if (array[mid] == target) {
                return "Element found at index - " + mid;
            } else if(array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end)/2;
        }

        return "Not Found";
    }

}