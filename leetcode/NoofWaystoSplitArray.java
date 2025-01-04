//2270
//https://leetcode.com/problems/number-of-ways-to-split-array/

public class NoofWaystoSplitArray {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long totalsum=0;
        for(int i=0; i<nums.length; i++){
            totalsum= totalsum+nums[i];
        }
        long leftsum = 0;
        for(int i=0; i<nums.length-1;i++){
            leftsum = leftsum + nums[i];
            totalsum-=nums[i];
            if(leftsum >= totalsum){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        NoofWaystoSplitArray obj = new NoofWaystoSplitArray();
        int[] nums = {1,1,1,1,1};
        System.out.println(obj.waysToSplitArray(nums));
    }
}
