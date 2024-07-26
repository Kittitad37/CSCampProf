public class CSPD6702_Q04 {
    public static void main(String[] args) {
        long factorial9 = fac(9);
        long factorial18 = fac(18);

        System.out.printf("9! = %d, 18! = %d", factorial9, factorial18);
    }

    public static long fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
