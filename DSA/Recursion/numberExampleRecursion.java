public class numberExampleRecursion {
    public static void main(String[] args) {
        printn(1);
    }

    static void printn(int n) {
        if( n == 6) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printn(n + 1);
    }
}
