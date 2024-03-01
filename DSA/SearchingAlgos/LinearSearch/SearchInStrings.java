import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "syed";
        //System.out.println("Enter a element form the string to search it's index or it's presence  " + name);
        System.out.println("Enter a element from the String to know it's preseace\n" + Arrays.toString(name.toCharArray()));
        // let's find e is present in the string or not
        char target = in.next().charAt(0);
        System.out.println(search(name, target));

    }

    // creating the string element search function
    static boolean search(String str, char target) {
        // if the String is empty then
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (element == target) {
                return true;
            }
        }
        return false;

    }
}
