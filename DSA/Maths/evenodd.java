public class evenodd {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("TRUE for odd and FALSE for even");
        System.out.println(evenodd(a));

    }
    static boolean evenodd(int a) {
        return (a & 1) == 1;

    }
}