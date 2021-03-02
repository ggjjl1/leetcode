package leetcode;

public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        int x, y;
        int i = 1;
        x = N % 10;
        int res = 0;
        while (N > 0) {
            y = x;
            x = N % 10;
            if (x > y) {
                res = x * i - 1;
                x = x - 1;
            } else {
                res = res + x * i;
            }
            N = N / 10;
            i *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        MonotoneIncreasingDigits mid = new MonotoneIncreasingDigits();
        System.out.println(mid.monotoneIncreasingDigits(777616726));
    }
}
