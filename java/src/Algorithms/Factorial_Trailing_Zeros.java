package Algorithms;

/**
 * Created by gaojunliang on 8/23/15.
 */
public class Factorial_Trailing_Zeros {
    public static int trailingZeroes(int n){
        long p = 0;
        for(long i=5;i<=n;i=i*5){
            p = p+n/i;
        }
        return (int)p;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("阶乘后0的个数为: "+trailingZeroes(2147483647));
        long end = System.currentTimeMillis();
        System.out.println("计算时间: " + (end - start) + "ms");
    }
}
