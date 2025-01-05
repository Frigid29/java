//link: https://leetcode.com/problems/3sum/description/
//15

import java.util.*;
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length && nums[i]<= 0; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }            
            twosums(nums, i, res);
        }
        return res;
    }
    public void twosums(int[] nums, int i, List<List<Integer>> res){
        int left = i+1, right = nums.length-1;
        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum < 0){
                left++;
            }
            else if(sum > 0){
                right--;
            }
            else{
                res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while(left < right && nums[left] == nums[left-1]){
                    left++;
                }
            }
        }
    }

    public List<List<Integer>> threeSum2(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i< nums.length && nums[i] <= 0; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            Set<Integer> set= new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int sum = -(nums[i] + nums[j]);
                if(set.contains(sum)){
                    res.add(Arrays.asList(nums[i], sum, nums[j]));
                }else{
                    set.add(nums[j]);
                }
            }
        }
        return res;
    } 

    public static void main(String[] args) {
        threeSum obj = new threeSum();
        int[] nums = {-1, 0, 1, 2, -1,};
        List<List<Integer>> res = obj.threeSum(nums);
        System.out.println(res);
    }
}
