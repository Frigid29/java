import java.util.*;
class strPalindrome
{

    public static boolean isPalindrome(String s)
    {
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!= s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word to check if its palindrome or not: ");
        String s=sc.next();
        s.trim();
        System.out.println(isPalindrome(s));
    }
}