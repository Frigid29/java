import java.util.*;
public class AnagramString {

    public static int count(String s, char ch){
        int c=0;
        for(int i=0; i<s.length();i++){
            if(ch==s.charAt(i)){
                c++;
            }
        }
        return c;
    }

    public static boolean check(String s1, String s2){
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(count(s1.toLowerCase(),ch) != count(s2.toLowerCase(),ch)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first word: ");
        String s1= sc.next();
        s1.trim();
        System.out.print("Enter second word: ");
        String s2= sc.next();
        s2.trim();
        System.out.println();
        if(s1.length() == s2.length()){
            if(check(s1, s2)){
                System.out.println("Anagram strings");
            }
            else{
                System.out.println("not anagram strings");
            }
        }
        else{
            System.out.println("not anagram strings");
        }
    }
}
