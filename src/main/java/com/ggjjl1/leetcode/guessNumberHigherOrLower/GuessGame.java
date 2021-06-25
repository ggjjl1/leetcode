package com.ggjjl1.leetcode.guessNumberHigherOrLower;

public class GuessGame {
    private int pick = 6;

    int guess(int num) {
        if (pick < num) {
            return -1;
        } else if (pick > num) {
            return 1;
        }
        return 0;
    }
}
