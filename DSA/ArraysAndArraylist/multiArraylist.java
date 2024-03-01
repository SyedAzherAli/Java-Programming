import java.util.ArrayList;
import java.util.Scanner;

/**
 * multiArrayList
 */
public class multiArraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //Add elements or taking input 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
} 