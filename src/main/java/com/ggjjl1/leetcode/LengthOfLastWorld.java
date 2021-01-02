package com.ggjjl1.leetcode;

/**
 * Created by gaojunliang on 8/3/15.
 */
public class LengthOfLastWorld {
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        String[] strArr = s.split(" ");
        if (strArr.length == 0) {
            return 0;
        }
        return strArr[strArr.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String t = "a ";
        System.out.println(lengthOfLastWord(t));
    }
}
