import java.util.Arrays;

public class buSeIn {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, -1, 2, 0, 1 };
        // Bubble(arr);
        // Selection(arr);
        Insertion(arr);         
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr,j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void Selection(int[] arr) {
       for(int i = 0; i < arr.length; i++) {
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr,maxIndex,last);
       }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start; 
        for(int i = 1; i < end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
        }
     }
     return max;
}


    static void Bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    //swap methord 
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
