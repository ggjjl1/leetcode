package com.ggjjl1.leetcode;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int res = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = i - 1 < 0 || flowerbed[i - 1] == 0;
                boolean right = i + 1 == flowerbed.length || flowerbed[i + 1] == 0;
                if (left && right) {
                    res++;
                    flowerbed[i] = 1;
                }
            }
        }
        return res >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1,0,0};
        int n = 2;
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }
}
