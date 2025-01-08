public class arraypartition {
    public static boolean partition(int[] ar){
        int sum=0;
        for(int i=0; i<ar.length; i++){
            sum = sum + ar[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        return sum(ar,sum/2);
    }
    public static boolean sum(int[] ar, int s){
        int l = ar.length+1;
        boolean[][] t = new boolean[l][s+1];
        for(int i = 0; i<s+1; i++){
            t[0][i] = false;
        }
        for(int j = 0; j<l; j++){
            t[j][0] = true;
        }

        for(int i=1;i<l;i++){
            for(int j=1; j<s+1; j++){
                if(ar[i-1]<=j){
                    t[i][j] = t[i-1][j-ar[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[l-1][s];
    }
    public static void main(String[] args) {
        int[] ar = {8,4,8,2,2};
        System.out.println(partition(ar));
    }
}
