package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaojunliang on 6/28/15.
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List list = new ArrayList();
        if (nums.length == 0) {
            return list;
        }
        if (nums.length == 1) {
            list.add(String.valueOf(nums[0]));
        } else {
            int start = nums[0];
            for (int i = 0; i <= nums.length - 2; i++) {
                if (nums[i + 1] - nums[i] != 1) {
                    if (i == nums.length - 2) {
                        int end = nums[i];
                        if (start < end) {
                            list.add(start + "->" + end);
                        } else {
                            list.add(String.valueOf(start));
                        }
                        list.add(String.valueOf(nums[i + 1]));
                    } else {
                        int end = nums[i];
                        if (start < end) {
                            list.add(start + "->" + end);
                        } else {
                            list.add(String.valueOf(start));
                        }
                        start = nums[i + 1];
                    }
                } else if (i == nums.length - 2) {
                    if (nums[i + 1] - nums[i] == 1) {
                        int end = nums[i + 1];
                        list.add(start + "->" + end);
                    } else {
                        int end = nums[i];
                        if (start == end) {
                            list.add(String.valueOf(start));
                        } else {
                            list.add(start + "->" + end);
                        }
                        list.add(String.valueOf(nums[i + 1]));
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 7};
        List<String> list = summaryRanges(array);
        for (String str : list) {
            System.out.println(str);
        }
    }
}