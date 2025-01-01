//link: https://leetcode.com/problems/product-of-array-except-self/
import java.util.*;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int pre=1, post=1;
        int[] res=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            res[i]=res[i]*post;
            post=post*nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        ProductOfArray p = new ProductOfArray();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(p.productExceptSelf(nums)));
    }
}
