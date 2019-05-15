package Algorithms;

/**
 * Created by ggjjl1 on 9/15/15.
 */
public class Palindrome_Number {
    public static boolean isPalindrome(int x){
        int z = 0;
        int y = x;
        while(x>0){
            z = z*10 + x%10;
            x = x/10;
        }
        if(z == y){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if(isPalindrome(12321)){
            System.out.println("是回文数");
        }else{
            System.out.println("不是");
        }
    }
}
