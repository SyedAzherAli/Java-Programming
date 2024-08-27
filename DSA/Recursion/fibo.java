public class fibo {
    public static void main(String[] args) {
        int ans = febo(50);
        System.out.println(ans);
    }
    static int febo(int n) {
        if(n < 2) {
            return n;
        }
        return febo(n-1) + febo(n-2);
    }
}
