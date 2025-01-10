//link: https://leetcode.com/problems/word-subsets/
import java.util.*;
public class WordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words1.length; i++){
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(int j=0; j<words1[i].length(); j++){
                if(map.containsKey(words1[i].charAt(j))){
                    map.put(words1[i].charAt(j), map.get(words1[i].charAt(j))+1);
                }else{
                    map.put(words1[i].charAt(j),1);
                }
            }
            if(check(map,words2)){
                ans.add(words1[i]);
            }
        }
        return ans;
    }

    public boolean check(Map<Character, Integer> map, String[] s){
        for(int i =0; i<s.length; i++){
            Map<Character, Integer> map2 = new LinkedHashMap<>(map);
            if(s[i].length()==1){
                if(!map2.containsKey(s[i].charAt(0))){
                    return false;
                }
            }
            else{
                for(int j=0; j<s[i].length(); j++){
                    char ch= s[i].charAt(j);
                    if(!map2.containsKey(ch)){
                        return false;
                    }else if(map2.get(ch)<=0){
                        return false;
                    }else{
                        map2.put(ch, map2.get(ch)-1);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordSubset w = new WordSubset();
        String[] s1= {"leetccode"};
        String[] s2= {"ccc"};
        System.out.println(w.wordSubsets(s1, s2));
    }
}
