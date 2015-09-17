/**
 * Created by gaojunliang on 8/23/15.
 */
public class Factorial_Trailing_Zeros {
    public static int trailingZeroes(int n){
        int p = 1;
        long i = 5;
        if(n<5){
            return 0;
        }
        while(i<=n){
            i = i*5;
            p = p*5+1;
            if(i>2147483647){
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("阶乘后0的个数为: "+trailingZeroes(2147483647));
        long end = System.currentTimeMillis();
        System.out.println("计算时间: " + (end - start) + "ms");
    }
}
