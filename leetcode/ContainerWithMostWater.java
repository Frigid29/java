//link: https://leetcode.com/problems/container-with-most-water/
//11

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1; 
        int min = Math.min(height[left], height[right]);
        int ans = min * (right - left);
        System.out.println(right - left);
        while(left <= right){
            min = Math.min(height[left], height[right]);
            ans = Math.max(ans, (min * (right - left)));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(c.maxArea(height));
    }
}
