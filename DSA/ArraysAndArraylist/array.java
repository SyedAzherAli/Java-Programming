/**
 * array
 */
import java.util.Arrays;
import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // // Arrays of Premitives 
        // int[] arr = new int[5];
      
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(i);
        // }

        //you can also define array as follow 
        // int[] arr = {1,2,3,4,5};
        // for (int i = 0; i <= arr.length; i++) {
        //     System.out.println(i);
        // }

        // String[] arr = new String[4];
      
        //taking array input 
        // for(int i=0; i<arr.length; i++) {
        //     arr[i] = scanner.nextInt();
        // }

        // printing the array 
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for( int num : arr) {
        //     System.out.print(num + " ");
        // }

        // System.out.println(Arrays.toString(arr));


        // Array of Objects
        String[] str = new String[4];
        // takinig input for an aray str
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        System.out.println(Arrays.toString(str));
        for( String num : str){
            System.out.print(num + " ");
        }
        System.out.println();
    }   
}