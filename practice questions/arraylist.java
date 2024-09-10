//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println();
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.print("Enter the no. of terms in this array: ");
            int d=sc.nextInt();
            int[] ar= new int[d];
            for(int j=0; j<d; j++){
                System.out.print("enter the term: ");
                ar[j]=sc.nextInt();
                System.out.println();
            }
            list.add(ar);
        }
        System.out.print("enter the query: ");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int[] arr;
            System.out.print("enter the query row: ");
            int r= sc.nextInt();
            System.out.print("enter the query col: ");
            int c= sc.nextInt();
            arr= list.get(r-1);
            if(c>0 && arr.length< c){
                System.out.println("ERROR!");
                
            }else{
                System.out.println(arr[c-1]);
            }
        }
    }
}
