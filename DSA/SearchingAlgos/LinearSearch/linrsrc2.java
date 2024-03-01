

public class linrsrc2 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33 ,44, 55,66};
        int target = 22;
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);

    }
    // hear creatingh linear search methord fot searching the target index number 
    static boolean linearSearch(int[] array, int target){
        if (array.length == 0)   {              
            return false;
        }
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return true;
            }
        } 
        // if the element is not present in the array 
        /// then reruen false 
        return false;  
    }


}
