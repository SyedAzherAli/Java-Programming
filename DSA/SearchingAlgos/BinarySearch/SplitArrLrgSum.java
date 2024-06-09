//https://leetcode.com/problems/split-array-largest-sum/description/    
//asked in google intervie
public class SplitArrLrgSum {
public static void main(String[] args) {
    int[] nums = {7,2,5,10,8};
    int ans = splitArray(nums, 2);
    System.out.println(ans);

}
static int splitArray(int[] nums, int k) {
        int start = 0; 
        int end = 0;
    //find case1 : minimum no of partation is 1 and sum of it
    //find case2 : maxumum no of partation is for above is array is 5 and it's largets element 
    for(int i = 0; i < nums.length; i++){
        end = end + nums[i];
        // start = Math.max(start, nums[i]); //if i don't know this 
        start = maxElementInArray(nums);
    }
    //binary search 
    while(start < end) {
        int mid = start + (end - start) / 2; 
        int sum = 0; 
        int partation = 1; //minimum no of partation(split) is atleast 1 
        for(int num : nums) {
            if(sum + num > mid){
                sum = num; 
                partation++;
            }
            else{
                sum = sum + num;
            }
        }
            if(partation > k) {
                start = mid + 1;     
            }
            else {
                end = mid; 
            }
       

    }   
    return end;

}

    // methrod to find the largerst element in an array 
    static int maxElementInArray(int[] nums) {
        int ans = 0; 
        for(int i = 0; i < nums.length; i++ ) {
            if(ans < nums[i]) {
                ans = nums[i];
            }
        }return ans; 
        }
}


