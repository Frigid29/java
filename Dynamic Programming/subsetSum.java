public class subsetSum {
    public static boolean sum(int[] ar, int sum){
        boolean[][] t = new boolean[ar.length+1][sum+1];
        for(int i=0;i<=ar.length;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    t[i][j] = false;
                }
                if(j==0){
                    t[i][j] = true;
                }
            }
        }
        for(int i=1; i<t.length; i++){
            for(int j=1; j<t[0].length; j++){
                if(ar[i-1] <= j){
                    t[i][j] = t[i-1][j-ar[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        for(int i=0;i<=ar.length;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
        return t[ar.length][sum];
    }

    public static void main(String[] args) {
        int[] ar={2,3,7,8,10};
        System.out.println(sum(ar, 6));
    }
}
