//link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

//ques: 153
import java.util.*;
public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums[0];
        while (left <= right) {
            if(nums[left]<nums[right]){
                ans = Math.min(ans, nums[left]);
            }
            int mid = left + (right - left) / 2;
            ans = Math.min(ans, nums[mid]);
            if(nums[left] <= nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

    public static int findmin(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while (left < right) {
            //if loop is sorted
            if(nums[left] < nums[right]){
                mid = nums[left];
                break;
            }
            //if loop is not sorted  then the smallest value is in the unsorted section
            if(nums[left] < nums[mid]){
                //left of mid is sorted 
                left = mid;
            }
            if(nums[mid] < nums[right]){
                //right of mid is sorted
                right = mid;
            }
            mid = left + (right - left) / 2;
            if(mid == left || mid == right){
                //only two elements are remaining out of which one is the desired answer. eg: [5,1]
                mid = Math.min(nums[left], nums[right]);
                break;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] ar = {11,13,15,17};
        System.out.println(findmin(ar));
    }
}
