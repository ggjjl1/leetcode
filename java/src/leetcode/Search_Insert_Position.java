package leetcode;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;++i) {
            if(target == nums[i]) {
                return i;
            }
            if(i != nums.length-1 && target>nums[i] && target<nums[i+1]) {
                return i+1;
            }
            if(target>nums[nums.length-1]){
                return nums.length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Search_Insert_Position sip = new Search_Insert_Position();
        int[] array = {1,3,5,6};
        int target = 5;
        int r = sip.searchInsert(array,target);
        System.out.println(r);
    }
}
