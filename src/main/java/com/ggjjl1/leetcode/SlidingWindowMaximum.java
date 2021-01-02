package com.ggjjl1.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            int maxValue = nums[i];
            for (int j = 0; j < k; j++) {
                maxValue = Math.max(nums[i + j], maxValue);
            }
            result.add(maxValue);
        }
        int[] array = new int[result.size()];
        for (int n = 0; n < result.size(); n++) {
            array[n] = result.get(n);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(nums, k)));
    }
}
