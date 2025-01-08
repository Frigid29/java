public class BasicKnapsack {
    public int knapSack(int[] wt, int[] val, int w){
        int n = val.length;
        int[][] dp = new int[n+1][w+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i < w+1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j< w+1; j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        BasicKnapsack obj = new BasicKnapsack();
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int w = 7;
        System.out.println("Maximum value = " + obj.knapSack(wt, val, w));
    }
}
