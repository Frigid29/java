//link: https://leetcode.com/problems/climbing-stairs/description/

import java.util.*;
public class ClimbingStairs {
    public int climbStairs(int n) {
        int ar[] = new int[n+1];
        Arrays.fill(ar, -1);
        return climbStairs(ar, n);

    }
    public int climbStairs(int[] ar, int n){
        if(n==0){
            ar[0]=0;
            return 0;
        }
        if(n==1){
            ar[1]=1;
            return 1;
        }
        if(n==2){
            ar[2]=2;
            return 2;
        }
        if(ar[n] != -1){
            return ar[n];
        }
        int ans = climbStairs(ar,n-1) + climbStairs(ar,n-2);
        ar[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(42)); 
    }
}
