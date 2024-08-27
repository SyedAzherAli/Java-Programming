public class BS {
    public static void main(String[] args){
        int[] arr = {1,2,5,7,12,22,53,54,89};
        int target = 54;
        int ans = BinarySearchRecursion(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }
    static int BinarySearchRecursion(int[] arr, int target, int s, int e) {
        int m = s + (e - s)/2; 
        if(s > e) {
            return -1;
        }
        if(target == arr[m]) {
            return m;
        }
        if(target < arr[m]) {
            return BinarySearchRecursion(arr, target, s, m - 1);
        }
        return BinarySearchRecursion(arr, target, m + 1, e);
    }
}