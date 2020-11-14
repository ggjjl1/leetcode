package leetcode;

/**
 * Created by gaojunliang on 8/3/15.
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        if (n <= 0) {
            return 0;
        }
        int len = n - 1;
        int[] a = new int[len];
        /**
         * 初始化数组，使数组中所有元素的值都为0
         */
        for (int i = 0; i < len; i++) {
            a[i] = 0;
        }
        for (int j = 1; j < len; j++) {
            int flag = 0;
            for (int k = 2; k <= (int) Math.sqrt((double) (j + 1)); k++) {
                if (a[k - 1] == 1 && (j + 1) % k == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                a[j] = 1;
                System.out.println(j + 1);
            }
        }
        int sum = 0;
        for (int l = 0; l < len; l++) {
            if (a[l] == 1) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("10亿内的素数个数：" + countPrimes(100000000));
        long end = System.currentTimeMillis();
        long time = end - start;
        if (time > 1000) {
            System.out.println("计算时间：" + time / 1000 + "秒");
        } else {
            System.out.println("计算时间：" + time + "毫秒");
        }
    }
}
