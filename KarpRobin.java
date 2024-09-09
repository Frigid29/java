import java.util.*;
public class KarpRobin {
    private final int PRIME=101;
    private double createHash(String str){
        double hash = 0;
        for(int i=0;i<str.length();i++){
            hash = hash + str.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }

    private double updateHash(Double prevHash, char oldchar, char newchar, int patternLength){
        double newhash=(prevHash - oldchar)/PRIME;
        newhash = newhash + newchar*Math.pow(PRIME,  patternLength-1);
        return newhash;
    }

    public void search(String text, String pattern){
        int patternLength = pattern.length();
        double patternHash = createHash(pattern);
        double textHash = createHash(text.substring(0,patternLength));
        for(int i=0; i<text.length()-patternLength; i++){
            if(patternHash == textHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("pattern found at index --> " + i);
                    return;
                }
            }
            if(i<text.length()-patternLength){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i+patternLength),patternLength);
            }
        }
        System.out.println("pattern not found");
    }

    public static void main(String[] args) {
        KarpRobin kr = new KarpRobin();
        kr.search("apoorvkunalrahul", "kunal");
    }
}
