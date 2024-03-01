import java.util.Arrays;
public class findMin{
    public static void main(String[] args) {
        int[] arr = { 2, 44, 23, -1, 88, -11,22, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));

    }
    // creating methrod to find minimum number in the array 
    static int min(int[] array) {
        // int ans = array[0];
        int ans = Integer.MAX_VALUE;
            for(int i = 0; i<array.length; i++){
            if(array[i] < ans){ // to find the maximum value from the array use grather the '>'
                ans = array[i];
            }
        }
        return ans;
    }
}