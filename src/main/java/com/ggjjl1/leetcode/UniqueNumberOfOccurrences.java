package com.ggjjl1.leetcode;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = 1;
            if (map.containsKey(arr[i])) {
                value = map.get(arr[i]) + 1;
            }
            map.put(arr[i], value);
        }
        
        Map<Integer, Integer> result = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	if(result.containsKey(entry.getValue())) {
        		return false;
        	}
        	result.put(entry.getValue(), 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(100, 1);
        map.put(200, 1);
        map.put(300, 1);

        System.out.println(map.get(100).toString());
    }
}
