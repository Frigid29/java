//in an array every no. appears twice except one number, find that number.
public class Single {
    public static void main(String args[])
    {
        int ar[]={2,3,4,2,6,3,4};
        System.out.println(ans(ar));
    }
    public static int ans(int[] arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique^=arr[i];
        }
        return unique;
    }
}