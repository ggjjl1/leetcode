package com.ggjjl1.leetcode;

import java.util.Arrays;

/**
 * leetcode.547  省份数量
 * https://leetcode-cn.com/problems/number-of-provinces/
 */

public class NumberOfProvinces {
    public class LinkedNode {
        int x;
        int y;
        LinkedNode next;
    }

    public int findCircleNum(int[][] isConnected) {
        for (int i = 0; i < isConnected[0].length; i++) {
            for (int j = 0; j < isConnected.length; j++) {
                if (i != j && isConnected[i][j] == 1) {

                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 1},
                {1, 1, 1}
        };

        System.out.println(array.length);
    }
}
