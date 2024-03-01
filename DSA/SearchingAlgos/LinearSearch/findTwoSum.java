import java.util.Arrays;
import java.util.Scanner;

public class findTwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(nums));
        int target = in.nextInt();
        int[] ans = findSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findSum(int[] array, int target) {
        int n = array.length;
        // first loop to itrate through the, first element to last second element
        for (int i = 0; i < n - 1; i++) { // it itrate from 2,7,11
            // second loop to itrate throgh the, second element to last element
            for (int j = i + 1; j < n; j++) // it itrate form 7,11,15
                if (array[i] + array[j] == target) {
                    return new int[] { i, j };
                }

        }
        return new int[] {};
    }
}
