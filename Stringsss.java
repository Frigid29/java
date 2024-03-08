import java.util.*;
class Stringsss
{
    public static void main(String[] args) {
        String s= new String("akash");
        String n="akash";
        String s1=s;
        System.out.println(s==n); // false
        System.out.println(s1==n);// false
        System.out.println(s==s1);//true
        System.out.println(s.equals(s1)); //true
        System.out.println(s.equals(n));//true

    }
}