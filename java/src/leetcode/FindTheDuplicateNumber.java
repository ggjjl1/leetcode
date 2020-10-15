package leetcode;

/**
 * Created by ggjjl1 on 10/9/15.
 */
public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (a[nums[i]] == 1) {
                return nums[i];
            } else {
                a[nums[i]] = 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] n = {1, 1};
        System.out.println(findDuplicate(n));
    }
}
