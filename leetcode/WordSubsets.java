//link: https://leetcode.com/problems/word-subsets/
import java.util.*;
public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] maxfreq = new int[26];
        for(String word: words2){
            int[] freq = new int[26];
            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
                maxfreq[ch-'a']= Math.max(maxfreq[ch-'a'],freq[ch-'a']);
            }
        }
        for(String s:words1){
            int[] freq=new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
            }
            if(check(maxfreq,freq)){
                ans.add(s);
            }
        }
        return ans;
    }

    public boolean check(int[] ar2, int[] ar){
        for(int i =0; i<26;i++){
            if(ar[i]<ar2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordSubsets w = new WordSubsets();
        String[] s1= {"leetccode"};
        String[] s2= {"ccc"};
        System.out.println(w.wordSubsets(s1, s2));
    }
}
