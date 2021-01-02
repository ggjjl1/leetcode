package com.ggjjl1.leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length;
        int i = end - 1;
        int[] nums = new int[end--];
        while (i >= 0) {
            nums[i--] = A[start] * A[start] >= A[end] * A[end] ? A[start] * A[start++] : A[end] * A[end--];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        System.out.println(Arrays.toString(squaresOfASortedArray.sortedSquares(A)));
    }
}
