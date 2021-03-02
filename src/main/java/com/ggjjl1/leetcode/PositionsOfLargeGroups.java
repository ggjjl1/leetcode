package com.ggjjl1.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char ch = s.charAt(0);
        int count = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0 && i == s.length() - 1 && s.charAt(i) == s.charAt(i - 1)) {
                if (count >= 2) {
                    List<Integer> group = new ArrayList<>();
                    group.add(start);
                    group.add(i);
                    res.add(group);
                }
            }
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                if (count >= 3) {
                    List<Integer> group = new ArrayList<>();
                    group.add(start);
                    group.add(i - 1);
                    res.add(group);
                }
                ch = s.charAt(i);
                count = 1;
                start = i;
            } else {
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PositionsOfLargeGroups positionsOfLargeGroups = new PositionsOfLargeGroups();
        List<List<Integer>> list = positionsOfLargeGroups.largeGroupPositions("aaa");
        for(List<Integer> group: list){
            System.out.println(Arrays.toString(group.toArray()));
        }
    }
}
