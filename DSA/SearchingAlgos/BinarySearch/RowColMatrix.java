import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] nums = { {1,2,3},{4,5,6},{7,8,9} };
        int target = 5;
        int[] ans = bnrySrc2D(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    //binary search in 2d sorted array 
    static int[] bnrySrc2D(int[][] nums, int target) {
        int row = 0; //starting index of row 
        int col = nums[row].length - 1; //length of col 0 hear it is 2
        while(row < nums.length && col >= 0) { 
            if(nums[row][col] == target) {
                return new int[] {row, col};
        }
        // Target lies in further row
        if(nums[row][col] < target) {
            row++;
        }
        // Target lies in previous col 
        else{
            col--;
        }
    }
    return new int[] {-1,-1};
}
}