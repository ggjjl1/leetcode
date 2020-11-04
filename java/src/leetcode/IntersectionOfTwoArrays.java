package leetcode;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        Set<Integer> dest = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i = i + 1;
                continue;
            }
            if (nums1[i] > nums2[j]) {
                j = j + 1;
                continue;
            }
            if (nums1[i] == nums2[j]) {
                dest.add(nums1[i]);
                i = i + 1;
                j = j + 1;
            }
        }
        List<Integer> dest2 = new ArrayList<>(dest);
        int[] result = new int[dest2.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = dest2.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(intersectionOfTwoArrays.intersection(nums1, nums2)));
    }
}
