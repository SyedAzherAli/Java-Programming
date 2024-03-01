import java.util.Arrays;

/**
 * SearchIn2DArray
 */
public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 56, 11, 22 },
                { 23, 21, 211 },
                { 78, 12, 123 },
                { 123, 12 }
        };
        int target = 123;       
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int [] {-1, -1};
    }
}