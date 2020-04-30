package Algorithms;

/**
 * Created by gaojunliang on 9/18/15.
 */
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target){
        int[] z={0,0};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] a = {i+1,j+1};
                    return a;
                }
            }
        }
        return z;
    }

    public static void main(String[] args) {
        int[] numbers={2, 7, 11, 15};
        int target=9;
        System.out.println(twoSum(numbers,target)[0]+" "+twoSum(numbers,target)[1]);
    }
}
