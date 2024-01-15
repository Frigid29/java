import java.util.*;
import java.math.*;

public class ceiling {
    public static void main(String[] args) {
        int[] ar= {18,16,14,9,5,3,2};
        int target=14;
        System.out.println(ceil(ar, target));
    }

    public static int ceil(int[] ar,int target){
        int small= Integer.MAX_VALUE;
        int st=0;
        int end=ar.length-1;
        while(st<=end){
            int mid= st + (end - st) /2;
            if(ar[mid] == target){
                return ar[mid];
            }else{
                if(ar[mid]>target){
                    small= Math.min(small,ar[mid]);
                }
                if(ar[st]<ar[end]){
                    if(ar[mid]<target){
                        st=mid+1;
                    }else{
                        end=mid-1;
                    }
                }else{
                    if(ar[mid]<target){
                        end=mid-1;
                    }else{
                        st=mid+1;
                    }
                }
            }
        }
        return small;
    }

}
