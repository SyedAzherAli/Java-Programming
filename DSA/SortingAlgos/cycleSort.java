import java.util.Arrays;
public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {20,30,10,40};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0;  
        while(i < arr.length) {
            int correct = (arr[i] - 10)/10; 
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }


    static void swap(int[] arr, int start, int end) {
        int temp = arr[start]; 
        arr[start] = arr[end];
        arr[end] = temp;
}
}