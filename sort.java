import java.util.*;
import java.math.*;

public class sort {

    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            int position=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[position]<arr[j])
                {
                    position=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[position];
            arr[position]=temp;
        }
    }

    public static void InsertionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && curr>arr[prev])
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void CountingSort(int arr[]){
        int max=Integer.MIN_VALUE;

        //finding the largest no. which will act as the end of the range
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        //counting the occurence of each term
        int count[] = new int[arr.length+1];
        for(int i=0;i<max+1;i++){
            count[arr[i]]++;
        }


        //sorting the array
        int j=0;
        for(int i=(count.length-1);i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        CountingSort(arr);
        printarr(arr);
    }
}
