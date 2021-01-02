package com.ggjjl1.leetcode;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {

        StringBuilder sb = new StringBuilder();
        int pre_index = 0, index = 0;
        while (k > 0) {
            for (int i = index + 1; i <= k; i++) {
                if (num.charAt(i) < num.charAt(index)) {
                    index = i;
                }
            }
            sb.append(num.charAt(index));
            k = k - (index - pre_index);
            pre_index = index;
        }
        for (int j = index; j < num.length(); j++) {
            sb.append(num.charAt(j));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        RemoveKDigits removeKDigits = new RemoveKDigits();
        System.out.println(removeKDigits.removeKdigits(num, k));
    }
}
