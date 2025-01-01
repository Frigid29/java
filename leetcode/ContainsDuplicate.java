//link: https://leetcode.com/problems/contains-duplicate/
import java.util.*;


public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(obj.containsDuplicate(nums));
    }
}
