package leetcode;

/**
 * Created by ggjjl1 on 9/14/15.
 */
public class SqrtX {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int i;
        for (i = 1; i < x; i++) {
            if (i * i <= x && (x - i * i) < 2 * i + 1) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
//        System.out.println(46340*46340);
        System.out.println(mySqrt(2147483647));
    }
}
