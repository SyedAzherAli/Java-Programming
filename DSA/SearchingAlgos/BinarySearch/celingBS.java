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

//kunal's code 
// package com.kunal;

// public class Ceiling {

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 9, 14, 16, 18};
//         int target = 15;
//         int ans = ceiling(arr, target);
//         System.out.println(ans);
//     }

//     // return the index of smallest no >= target
//     static int ceiling(int[] arr, int target) {

//         // but what if the target is greater than the greatest number in the array
//         if (target > arr[arr.length - 1]) {
//             return -1;
//         }
//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 // ans found
//                 return mid;
//             }
//         }
//         return start;
//     }
// }