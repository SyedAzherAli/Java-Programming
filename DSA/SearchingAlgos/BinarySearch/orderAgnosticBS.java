public class orderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr =  {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //decending order
        int[] arr = {110,99,82,60,49,45,32,21,18,15,10,6,2,1,0,-1,-7,-66};
        int target = 0;
        int ans = orderAgnosticbs(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticbs(int[] array, int target) {
        int start = 0; // first index value
        int end = array.length - 1; // last index value

        // finding the sorted array is accending or decending
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (array[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}



// public class orderAgnosticBS {
//     public static void main(String[] args) {
// //        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//         int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
//         int target = 22;
//         int ans = orderAgnosticBS(arr, target);
//         System.out.println(ans);
//     }

//     static int orderAgnosticBS(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         // find whether the array is sorted in ascending or descending
//         boolean isAsc = arr[start] < arr[end];

//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if (target > arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }