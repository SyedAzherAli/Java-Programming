import java.util.Arrays;


public class revise {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 23, 45, 65 };
        int [] array = revesearr(arr);
        System.out.println(Arrays.toString(arr));
        int target = 9;
        int ans = bnrsrc(array, target);
        System.out.println(ans);
    }

    static int bnrsrc(int array[], int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc;
        if (array[start] < array[end]) {
            isAsc = true;  
        } else {
            isAsc = false;
        }
        while (start <= end) {
            // find the meddle element
            int mid = start + (end - start) / 2;


            if (target == array[mid]) {
                return mid;
            }

            if (isAsc) {    
                if (target > array[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            
        }
      return -1; 

}

//making the array from accending order to decending order
static int[] revesearr(int[] array){
    int start = 0; 
    int end = array.length -1; 
    while (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
return array;
}
}



