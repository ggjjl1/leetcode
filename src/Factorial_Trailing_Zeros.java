/**
 * Created by gaojunliang on 8/23/15.
 */
public class Factorial_Trailing_Zeros {
    public static int trailingZeroes(int n){
        int p = 0;
        int numsOf2 = 0;
        int numsOf5 = 0;
        for(int i=0;i<n;i++){
            p = n - i;
            while(p%2==0){
                numsOf2++;
                p = p/2;
            }
            while(p%5==0){
                numsOf5++;
                p = p/5;
            }
        }
        if(numsOf2<numsOf5){
            return numsOf2;
        }
        return numsOf5;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("阶乘后0的个数为: "+trailingZeroes(1808548329));
        long end = System.currentTimeMillis();
        System.out.println("计算时间: " + (end - start) + "ms");
    }
}
