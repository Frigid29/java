//1769 link: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/?envType=daily-question&envId=2025-01-06

import java.util.*;
class leetcode_1769{
    public int[] minOperations(String s) {
        int[] sum = new int[s.length()];
        int[] nsum = new int[s.length()];
        int prev = 0;
        for(int i = 0; i < s.length(); i++){
            if(i==0){
                sum[i] = prev;
                prev = prev + (int)(s.charAt(i) - '0');
            }
            else{
                sum[i] = sum[i-1] + prev;
                prev = prev + (int)(s.charAt(i) - '0');
            }
        }
        prev = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(i == s.length() -1){
                nsum[i] =prev;
                prev = prev + (int)(s.charAt(i) - '0');
            }
            else{
                nsum[i]= nsum[i+1] + prev;
                prev = prev + (int)(s.charAt(i) - '0');
            }
        }
        for(int i = s.length()-1; i >= 0; i--){
            sum[i] = sum[i] + nsum[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        leetcode_1769 obj = new leetcode_1769();
        String s = "110";
        System.out.println(Arrays.toString(obj.minOperations(s)));
    }
}
