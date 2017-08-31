package java;

/**
 * Created by gaojunliang on 7/25/15.
 */
public class Power_of_Two {
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        if(n/2>0){
            if(n%2>0){
                return false;
            }else{
                return isPowerOfTwo(n/2);
            }
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        if(isPowerOfTwo(a)){
            System.out.println("是平方数！");
        }else{
            System.out.println("不是！");
        }
    }
}