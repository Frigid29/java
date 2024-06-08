public class StringToInteger {
    public static void main(String[] args) {
        String s="1111011110000011100000110001011011110010111001010111110001";
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                num=num+(int)Math.pow(2,s.length()-1-i);
            }
        }
        System.out.println(num);
    }
}
