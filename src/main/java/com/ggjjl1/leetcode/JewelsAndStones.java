package com.ggjjl1.leetcode;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) >= 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("abcd".indexOf("a"));
    }

}
