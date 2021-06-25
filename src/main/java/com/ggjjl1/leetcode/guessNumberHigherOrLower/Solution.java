package com.ggjjl1.leetcode.guessNumberHigherOrLower;

public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) < 0) {
                right = mid - 1;
            } else if (guess(mid) > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 100;
        System.out.println(solution.guessNumber(n));
    }
}
