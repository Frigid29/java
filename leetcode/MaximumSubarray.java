//link: https://leetcode.com/problems/maximum-subarray/description/


public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int maxsum = current;
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maxsum = Math.max(maxsum,current);
        }
        return maxsum;
    }    
    public static void main(String[] args) {
        int[] ar={-1,-2,-5,5,6,2,1,-5};
        MaximumSubarray ms = new MaximumSubarray();
        System.out.println(ms.maxSubArray(ar));
    }
}
