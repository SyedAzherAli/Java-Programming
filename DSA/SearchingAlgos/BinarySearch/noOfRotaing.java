public class noOfRotaing {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 1 , 2, 3, 4};
        int ans = findPivotIndex(nums);
        System.out.println(ans);
        int ans1 = noOfRotation(nums, ans);
        System.out.println(ans1);
}
static int noOfRotation(int[] nums, int pivot) {
    int count = 0;
    for(int i = 0; i <= pivot; i++) {
        count++;
}
return count;
}

static int findPivotIndex(int[] nums){
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if(mid < end  && nums[mid] > nums[mid + 1]) {
            return mid;
    }
    if(mid > start && nums[mid] < nums[mid - 1]) {
        return mid - 1;
    }
    if (nums[mid] <= nums[start]) {
        end = mid - 1;
    }
    else{
        start = mid + 1;
    }
}
return -1;
}
}