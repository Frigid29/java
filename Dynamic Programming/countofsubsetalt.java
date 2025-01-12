public class countofsubsetalt {
    public static int count2(int[] ar, int sum){
        int[][] t = new int[ar.length+1][sum+1];
        for(int i=0;i<=ar.length;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    t[i][j] = 0;
                }
                if(j==0){
                    t[i][j] = 1;
                }
            }
        }
        for(int i=1; i<t.length; i++){
            for(int j=1; j<sum+1; j++){
                if(ar[i-1] <= j){
                    t[i][j] = t[i-1][j-ar[i-1]] + t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[ar.length][sum];
    }

    public static void main(String[] args) {
        int[] ar={2,3,5,6,8,10};
        System.out.println(count2(ar, 10));
    }
}
