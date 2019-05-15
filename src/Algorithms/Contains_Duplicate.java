package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gaojunliang on 8/2/15.
 */
public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int e : nums){
            set.add(e);
        }
        if(set.size() != nums.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        if(containsDuplicate(arr)){
            System.out.println("存在相同元素！");
        }else{
            System.out.println("不存在");
        }
    }
}
