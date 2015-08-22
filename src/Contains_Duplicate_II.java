import java.util.HashSet;
import java.util.Set;

/**
 * Created by gaojunliang on 7/25/15.
 */
public class Contains_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1) {
            return false;
        }
        if (nums.length <= k) {
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
        for (int i = 0; i < nums.length-k+1; i++) {
            for (int j = i; j < i+k-1; j++) {
                for(int l=j+1;j<i+k;j++){
                    if(nums[j]==nums[l]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,1};
        int k = 29999;
        if(containsNearbyDuplicate(arr, k)){
            System.out.println("存在！");
        }else{
            System.out.println("不存在！");
        }
    }
}
