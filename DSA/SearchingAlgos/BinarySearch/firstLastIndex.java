// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// hear we have to find the first and last index of the repeating element in an array 
// for ex arr = {1,2,3,4,5,5,5,5,5,6,,7,9}; hear tha target is 5 and first index of it's is 4 and lst is 8
public class ltcd34 {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    //methord to find the index value of the target 
    int search(int[] nums, int target, boolean findStartIndex) {
        //copy past the binary search algo 
        int ans = -1;
        int start = 0;
        int end  = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                //answer found 
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
