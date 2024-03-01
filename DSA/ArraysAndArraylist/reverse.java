import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 6};
        // swap(arr,2, 4 );
        // System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0; //starting index number
        int end = arr.length - 1; //ending index number
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }
}
