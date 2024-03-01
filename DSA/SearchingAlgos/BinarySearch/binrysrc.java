public class binrysrc{
    public static void main(String[] args) {
        // binary search algo
        // let's take a sorted array in assending order 
        int[] arr = {2,4,5,6,9,12,13,16,200};
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }
    
    // creating a methrod to find the target using binary search algo
    static int binarySearch(int[] array, int target) {
        int start = 0; //first index of the array
        int end = array.length - 1; //last index number

        while(start <= end){
// to find the middle index number of the array, use formula (start + end)/2 or start + (end-start)/2 
            int mid = start + (end - start)/2;
            
            if(target < array[mid]){
               end = mid -1;
            }    
            else if(target > array[mid]) {
                start = mid + 1;
            }
            else {
                // if the mid is nor lesser nor grater the is equals to target
                return mid;
            }
        }
        return -1;
        
    }
}







