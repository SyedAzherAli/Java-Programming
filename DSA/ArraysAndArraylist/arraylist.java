import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Arraylis in Java 
        //Syntex
        ArrayList<Integer> list = new ArrayList<Integer>(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.print(list + " ");
        //use to know element contain in the array
        System.out.println(list.contains(6));
        // use to remove the element from the array using index number 
        list.remove(6);
        System.out.println(list);

        //input 
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        
        //get item of any index 
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index hear, list of [index] will not display 
            }

    }

}
