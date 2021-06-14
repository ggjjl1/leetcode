package com.ggjjl1.leetcode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            int maxValue = nums[i];
            for (int j = 0; j < k; j++) {
                maxValue = Math.max(nums[i + j], maxValue);
            }
            result.add(maxValue);
        }
        int[] array = new int[result.size()];
        for (int n = 0; n < result.size(); n++) {
            array[n] = result.get(n);
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\workspace\\leetcode\\src\\main\\resources\\sliding-window-maximum.txt");
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String lineTxt = null;
        int i = 0;
        String line1 = null;
        String line2 = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
            if (i == 0) {
                line1 = lineTxt;
            }
            if (i == 1) {
                line2 = lineTxt;
            }
            i++;
        }
        String[] stringArray = line1.substring(1, line1.length() - 1).split(",");
        int[] nums = new int[stringArray.length];
        for (int j = 0; j < stringArray.length; j++) {
            nums[j] = Integer.parseInt(stringArray[j]);
        }
        int k = Integer.parseInt(line2);
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(nums, k)));
    }
}
