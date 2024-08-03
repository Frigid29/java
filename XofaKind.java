//https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/submissions/1319455098/

import java.util.*;
class XofaKind {
    public static boolean hasGroupsSizeX(int[] deck) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<deck.length;i++){
            if(deck[i]!=-1){
                ans.add(count(deck,deck[i]));
            }
        }
        int size=ans.size();
        int prev=1;
        if(ans.get(0)==1 ){
            return false;
        }
        for(int i=0;i<size;i++){
            System.out.print(ans.get(i)+", ");
        }
        System.out.println();
        for(int i=1;i<size;i++){
            if(ans.get(i)==1){
                return false;
            }
            int temp=gcd(ans.get(0),ans.get(i));
            if(i>1){
                System.out.println(temp+" "+prev);
                if(temp==1 || temp!=prev){
                    return false;
                }
            }else{
                if(temp==1){
                    return false;
                }
            }
            prev=gcd(ans.get(0),ans.get(i));
        }
        return true;
    } 

    public static int gcd(int a, int b){
        int s=a<b?b:a;
        int m=a+b-s;
        int ans=1;
        for(int i=1; i<=s; i++){
            if(s%i==0 && m%i==0){
                ans=i;
            }
        }
        return ans;
    }

    public static int count(int[] arr, int num){
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                c++;
                arr[i]=-1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] deck={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,4,4,4,4,4,4,5,5,6,6,7,7};
        System.out.println(hasGroupsSizeX(deck));
    }
}