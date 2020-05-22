package leetcode;

/**
 * Created by ggjjl1 on 9/1/15.
 */
public class ClimbingStairs {
    public int climbStairs(int n){
        int a = 1, b = 1;
        for(int i=1; i<n; i++){
            b = a + b;
            a = b - a;
        }
        return b;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int result = cs.climbStairs(35);
        System.out.printf("结果：%d %n", result);
    }
}
