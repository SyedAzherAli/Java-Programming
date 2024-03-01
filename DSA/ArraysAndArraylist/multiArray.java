
import java.util.Arrays;
import java.util.Scanner;
public class multiArray {
    /*
     *  multiDimensionArray in Java 
     *  1 2 3 
     *  4 5 6
     *  7 8 9
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];
        // // taking input of an 2D array elements
        // for (int i = 0; i < arr.length; i++) {
        //   for (int j = 0; j < arr.length; j++) {
        //     arr[i][j] = sc.nextInt();
        //   }
        // }
        // // printing 2D array elements 
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //             System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] arr2D = { 
            {1,2,3}, // 0th index
            {4,5}, // 1st index
            {6,7,8,9} // 2nd index 
        };
        // indexing 
        System.out.println(arr2D[0][2]); // 3
        System.out.println(arr2D[1][0]); // 4
        System.out.println(arr2D.length);// no of rows

        
        
        //output of below array 
        //first loop itrates thorough the row 
        for( int row = 0; row < arr2D.length; row++){
            //second loop itrates through the colum, for each col in every row
            for (int col = 0; col < arr2D[row].length; col++) {
               System.out.print(arr2D[row][col] + " "); 
            }
            System.out.println();
        }

        //second method to pring an 2D array  also called as enhanced for loop
       for(int[] a : arr2D) {
            System.out.println(Arrays.toString(a));
       }

       //another method to pring 2D array
       for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
       }

       System.out.println("Taking input of 2d array 3x2");
       //input 
       int[][] arr= new int[3][2];
       for (int row = 0; row < arr.length; row++) {
            // for each col in row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]));
       }
    }
}


  
    

