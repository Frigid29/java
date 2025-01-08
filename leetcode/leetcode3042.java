//link: https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/?envType=daily-question&envId=2025-01-08

public class leetcode3042 {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i=0; i<words.length; i++){
            String s = words[i];
            
            for(int j = 0; j<words.length; j++){
                String s2 = words[j];
                if(j==i){
                    continue;
                }
                if(s.length() <= s2.length()){
                    if(s2.startsWith(s) && s2.endsWith(s)){
                    ans++;
                    }
                }
            }
        }  
      return ans;
    }
    public static void main(String[] args) {
        leetcode3042 obj = new leetcode3042();
        String[] words = {"a","aba","ababa","aa"};
        System.out.println(obj.countPrefixSuffixPairs(words));
    }
}
