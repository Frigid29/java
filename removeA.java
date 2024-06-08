class removeA
{
    public static void main(String[] args)
    {
        System.out.println(skipA("","baccad"));
    }
    static String skipA(String ans, String s)
    {
        if(s.isEmpty()){
            return ans;
        }
        if(s.charAt(0)!='a'){
            return skipA(ans+s.charAt(0),s.substring(1));
        }else{
            return skipA(ans,s.substring(1));
        }
    }
}