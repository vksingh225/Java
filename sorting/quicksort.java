public class quicksort {
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
        sort(arr, 0, n-1);
        printArray(arr);
    }

    public static void sort(int arr[], int low, int hi) {
        if(low < hi){
            int pivot = partition(arr, low, hi);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, hi);
        }
    }

    public static int partition(int arr[], int low, int hi) {
        int pivot = arr[hi];
        int i = low - 1;

        for (int j=low ; j<hi ; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        
        }

        int temp = arr[i+1];
        arr[i+1] = arr[hi];
        arr[hi] = temp;

        return i+1;
    }

    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
