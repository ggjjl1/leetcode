/**
 * Created by gaojunliang on 8/23/15.
 */
public class Factorial_Trailing_Zeros {
    public static int trailingZeroes(int n){
        int p = 1;
        while(n > 0){
            p = p * n;
            n--;
        }
        return p;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("阶乘后0的个数为: "+trailingZeroes(1808548329));
        long end = System.currentTimeMillis();
        System.out.println("计算时间: " + (end - start) + "ms");
    }
}
