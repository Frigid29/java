import java.util.*;
import java.math.*;

public class arraylogicques{
    public static void reverse(int arr[]){
        int start=0,last=arr.length -1;
        while(start<last){
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start++;
            last--;
        }
    }

    public static void pair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+tp);
    }

    public static void subArray(int arr[]){

        int min_sum=arr[0];
        int max_sum=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(min_sum>sum){
                    min_sum=sum;
                }
                if(max_sum<sum){
                    max_sum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min sum: "+min_sum);
        System.out.println("Max sum: "+max_sum);
    }

    public static void maxsub(int arr[]){
        int max_sum=arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(max_sum<sum){
                    max_sum=sum;
                }
            }
            
        }
        System.out.println("Max sum: "+max_sum);
    }

    public static void Kadan(int arr[]){
        int n=Integer.MIN_VALUE;//max value if all the terms are negative
        int cp=0;//count of positive
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                cp++;
            }
            n=Math.max(n,arr[i]);
        }
        if(cp==0){
            ms=n;
        }else{
            for(int i=0;i<arr.length;i++){
                cs+=arr[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(ms,cs);
            }
        }
        System.out.println("max sum: "+ ms);
    }

    public static void main(String[] args) {
        int arr[]={-4,-2,-3,-10,-5};
        /*reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        pair(arr);
        subArray(arr);*/
        maxsub(arr);
        Kadan(arr);
    }
}
