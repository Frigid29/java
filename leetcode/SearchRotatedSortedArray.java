//33
//link: https://leetcode.com/problems/search-in-rotated-sorted-array/
import java.util.*;

public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        if(map.containsKey(target)){
            return map.get(target);
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            //if only two elements are left
            if((left+1) == right){
                if(nums[left]==target){
                    return left;
                }
                if(nums[right]==target){
                    return right;
                }
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray solution = new SearchRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0,1,2};
        int target = 0;
        System.out.println(solution.search2(nums, target)); // 4
    }
}
