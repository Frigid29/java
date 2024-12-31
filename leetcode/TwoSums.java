//link: https://leetcode.com/problems/two-sum/description/

import java.util.*;
public class TwoSums {
    //brute force soln
    public int[] b_twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //linear soln
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSums ts = new TwoSums();
        System.out.println(Arrays.toString(ts.twoSum(new int[]{2,7,11,15,3,5},12)));
    }
}
