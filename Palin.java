class Palin
{
    public static void main(String[] args){
        System.out.println(palindrome(1235321));
    }

    static boolean palindrome(int n){
        String s= Integer.toString(n);
        return helper(s,0,s.length()-1);
    }

    static boolean helper(String s, int start, int end){
        boolean b=true;
        if(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            b=helper(s,start+1,end-1);
        }
        return b;
        
    }
}