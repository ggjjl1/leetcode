package leetcode;

import java.util.Arrays;

/**
 * Created by gaojunliang on 9/18/15.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] z = {0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return z;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(numbers, target)));
    }
}
