public class Singlein3 {
    public static void main( String args[]){
        int[] ar={3,9,3,3,4,6,4,6,4,6};
        System.out.println(ans(ar));
    }
    public static int ans(int[] ar){
        int unique=0;
        for(int i=0;i<ar.length;i++){
            unique+=ar[i];
        }
        return unique%3;
    }

}
