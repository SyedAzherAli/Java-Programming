// ask in amazon interview 
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfinityArray {
    public static void main(String[] args) {
    //find the element in the infinate array let's go 
        int[] arr = {3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    // methord to find the ans 
    static int ans(int[] array, int target) {
        int start = 0;
        int end = 1; // by defalut the indes value of start and is 0 and end let's 1
        //condition to stay in range    
        while(target > array[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp; 
        }
        return binarySearch(array, target, start, end);
    }
    static int binarySearch(int[] array, int target, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2; 
            if(target < array[mid]) {
                end = mid - 1;
            }
            else if(target > array[mid]){
                start = mid + 1; 
            }
            else{
                // ans found
                return mid;
            }
        }
        //if the value doesn't found 
        return -1;
    }


}