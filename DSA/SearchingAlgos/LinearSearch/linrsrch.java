public class linrsrch {
    public linrsrch() {
    }
 
    public static void main(String[] var0) {
       int[] arr= new int[]{18, 12, 9, 14, 77, 50};
 
       for(int index = 0; index < arr.length; index++) {
          if (arr[index] == 14) {
             System.out.println("VALUE 14 FOUND AT INDEX : " + index);
          } else {
             System.out.println("Value dose not found in index : " + index);
          }
       }
 
    }
 }