public class celingBS {
    public static void main(String[] args) {
        int[] arr = {2,2,5,9,14,16,18};
        int target = 17;
        int ans = celingBs(arr,target);
        System.out.println(ans);
    }
    static int celingBs(int[] array, int target ) { 
        int start = 0;
        int end = array.length - 1 ; // last element index no

        boolean isAsc = array[start] < array[end];

        while(start <= end) {
            
            int mid = start + (end - start)/2 ;

            if(target <= array[mid]) {
                return mid;
            }

            if(isAsc) {
               if(target > array[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
            else {
                if(target < array[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            
            


    }
    return -1;
}
}