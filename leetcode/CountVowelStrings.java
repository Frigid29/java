//link: https://leetcode.com/problems/count-vowel-strings-in-ranges/?envType=daily-question&envId=2025-01-02

import java.util.*;
public class CountVowelStrings {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[words.length];
        char[] ch={'a','e','i','o','u'};
        Set<Character> set = new HashSet<Character>();

        for(char c : ch){
            set.add(c);
        }

        int[] till= new int[words.length];
        int[] after= new int[words.length];

        for(int i = 0; i < words.length; i++){
            ans[i]=0;
            if((set.contains(words[i].charAt(0))) && (set.contains(words[i].charAt((words[i].length())-1))) ){
                ans[i]= ans[i]+1;
            }
            
        }

        for(int i=0; i<words.length; i++){
            if(i==0){
                till[i]=0;
            }else{
                till[i]= till[i-1] + ans[i-1];
            }
        }

        for(int i=words.length-1; i>=0; i--){
            if(i==words.length-1){
                after[i]=0;
                }else{
                    after[i]= after[i+1] + ans[i+1];
            }
        }

        int[] res= new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = (till[words.length-1] + ans[words.length-1])-(till[start] + after[end]);
        }

        return res;
    }
    public static void main(String[] args) {
        String[] s= {"aba","bcb","ece","aa","e"};
        int[][] q = {{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(vowelStrings(s,q)));;
    }
}
