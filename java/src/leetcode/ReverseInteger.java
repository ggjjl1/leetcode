package leetcode;

/**
 * Created by gaojunliang on 8/3/15.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int n = Math.abs(x);
        int s = 0;
        while (n / 10 != 0) {
            if (s * 10 / 10 != s) {
                return 0;
            }
            s = s * 10 + n % 10;
            n = n / 10;
            if (s * 10 / 10 != s) {
                return 0;
            }
        }
        if (s * 10 / 10 != s) {
            return 0;
        }
        s = s * 10 + n % 10;
        if (x < 0) {
            return -s;
        }
        return s;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(x);
        System.out.println(reverse(x));
    }
}
