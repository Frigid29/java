//link: https://leetcode.com/problems/maximum-product-subarray/

import java.util.*;
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = 1;
        int min = max;
        int ans = nums[0];
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            int b = min*nums[i];
            int c = max*nums[i];
            max = Math.max(a, Math.max(b,c));
            min = Math.min(a, Math.min(b,c));
            ans = Math.max(ans, max);
        }
        return ans;
    }
    public static void main(String[] args) {
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int[] nums = {2,3,-2,4};
        System.out.println(obj.maxProduct(nums));
    }
}
