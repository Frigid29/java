public class stringpalindrome {
    public static void main(String[] args) {
        String s="abcdedcba";
        int a=0;
        for(int i=0;i<=s.length()/2;i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                System.out.println("not palindrome");
                a++;
            }
        }
        if(a==0){
            System.out.println("palindrome");
        }
    }
}
