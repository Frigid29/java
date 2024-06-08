public class Count0 {
    public static void main(String[] args) {
        System.out.println(count(30200001));
    }

    static int count(int n){
        //int digits= (int)(Math.log10(n))+1;
        if(n==0){
            return 0;
        }
        int c= (n%10)==0?1:0;
        return c+ count(n/10);
    }
}
