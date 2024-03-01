public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 23, 43, 21, 234, 2322, 2 };
        System.out.println(digits(222));
        // for (int i = 0; i < nums.length; i++) {

        // System.out.println( even(nums[i]));

        // }
        System.out.println(findNumber(nums));
    }

    // findnumbers
    static int findNumber(int[] nums) {
        int count = 0;
        for (int num = 0; num < nums.length; num++) {
            if (even(nums[num])) {
                count++;
            }
        }
        return count;
    }

    // find the even
    static boolean even(int num) {

        if (digits(num) % 2 == 0) {

            return true;
        }
        return false;

    }

    // find the number of digits
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
