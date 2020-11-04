package leetcode;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int flag = o1.getValue().compareTo(o2.getValue());
                if (flag == 0) {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return flag;
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey());
            }
        }

        int[] d = new int[result.size()];

        for (int i = 0; i < d.length; i++) {
            d[i] = result.get(i);
        }

        return d;

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};
        SortArrayByIncreasingFrequency sortArrayByIncreasingFrequency = new SortArrayByIncreasingFrequency();
        System.out.println(Arrays.toString(sortArrayByIncreasingFrequency.frequencySort(nums)));
    }
}
