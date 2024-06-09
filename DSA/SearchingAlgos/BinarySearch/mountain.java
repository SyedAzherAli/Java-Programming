// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// it is a biotoinc array which means the first half elemements of the array is accending order and second half
// is decending order lika an mountain 
public class mountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 4, 3, 2 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}