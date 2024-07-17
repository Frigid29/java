import java.util.*;
public class UniqueBirthdayGift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the maximum possible value: ");
        int max=sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int len=sc.nextInt();
        int[] ar=new int[len];
        System.out.println(ans(ar,max,0));
    }
    public static int ans(int[] ar, int max, int index){
        int count=0;
        if(ar.length==1){
            return max;
        }
        if(index==ar.length){
            return 1;
        }
        for(int j=1;j<=max;j++){
            if(index==0){
                ar[index]=j;
                count+=ans(ar,max,index+1);
            }else{
                if(j%ar[index-1]==0){
                    ar[index]=j;
                    count+=ans(ar,max,index+1); 
                }
            }     
            
        }
        return count;
    }
}
