package com.ggjjl1.leetcode;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        return match(s, p, 0, 0);
    }

    public boolean match(String s, String p, int i, int j) {
        if (i == s.length() && j == p.length())
            return true;
        if (i == s.length() && j < p.length()) {
            if (j + 1 < p.length() && p.charAt(j + 1) == '*')
                return match(s, p, i, j + 2);
            if (j == '*')
                return match(s, p, i, j + 1);
            return false;
        }
        if (i < s.length() && j == p.length())
            return false;
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            if (p.charAt(j) != '.' && s.charAt(i) != p.charAt(j)) {
                return match(s, p, i, j + 2);
            } else {
                return match(s, p, i + 1, j + 2) || match(s, p, i + 1, j) || match(s, p, i, j + 2);
            }
        } else {
            if (p.charAt(j) != '.' && s.charAt(i) != p.charAt(j)) {
                return false;
            } else {
                return match(s, p, i + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        System.out.println(regularExpressionMatching.isMatch(s, p));
    }
}
