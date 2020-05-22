package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by gaojunliang on 7/25/15.
 */
public class Contains_Duplicate_II {
    class A{
        int value;
        int index;
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer> numsList = new ArrayList<Integer>();
        if(nums.length == 0 || nums.length == 1 || k == 0) {
            return false;
        }
        if (nums.length <= k+1) {
            for(int i=0;i<nums.length;i++){
                numsList.add(nums[i]);
            }
            Set<Integer> numsSet = new HashSet<Integer>(numsList);
            if(numsList.size() != numsSet.size()){
                return true;
            }
            return false;
        }
        for (int i = 0; i < nums.length-k; i++) {
            for(int j=i;j<i+k+1;j++){
                numsList.add(nums[j]);
            }
            Set<Integer> numsSet = new HashSet<Integer>(numsList);
            if(numsList.size() != numsSet.size()){
                return true;
            }
            numsList.clear();
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1};
        int k = 1;
        if(containsNearbyDuplicate(arr, k)){
            System.out.println("存在！");
        }else{
            System.out.println("不存在！");
        }
    }
}
