import java.util.*;
public class BitwiseSubsequence {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of elements: ");  
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        System.out.print("Enter the "+(i+1)+" element: ");
        arr[i]=sc.nextInt();
      }
      System.out.println(longest(arr,0));
    }
    //i=start position 
    public static int longest(int[] ar, int i){
        if(i==ar.length-1){
            return 0;            
        }
        int c=0;
        if((ar[i]&ar[i+1])*2 < (ar[i]|ar[i+1])){
            c=1+longest(ar,i+1);
        }else{
            c=longest(ar,i+1);
        }
        return c;
    }
}
