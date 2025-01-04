//link: https://leetcode.com/problems/unique-length-3-palindromic-subsequences/?envType=daily-question&envId=2025-01-04

//1930
//https://leetcode.com/problems/unique-length-3-palindromic-subsequences/

import java.util.*;

public class UniqueLength3palindrome {
    public int countPalindromicSubsequence(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        List<Character> set= new ArrayList<>(map.keySet());
        int size= set.size();
        int ans =0;
        for(int i=0;i< size ; i++){
            if(map.get(set.get(i))>=2){
                int st= s.indexOf(set.get(i));
                int l= s.lastIndexOf(set.get(i));
                String temp= "";
                for(int j=st+1;j<l;j++){
                    if(!temp.contains(""+(s.charAt(j)))){
                        ans++;
                        temp+=s.charAt(j);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        UniqueLength3palindrome obj = new UniqueLength3palindrome();
        System.out.println(obj.countPalindromicSubsequence("bbcbaba")); // 4
    }
}
