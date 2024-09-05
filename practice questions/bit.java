//gfg --> https://www.geeksforgeeks.org/problems/find-unique-element2632/1

import java.util.*;
public class bit {
    public static int findUnique(int k, int[] arr) {
        // code here
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int keys:map.keySet()){
            if(map.get(keys)%k !=0){
                return keys;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 2, 3, 1, 2, 1, 2};
        System.out.println(findUnique(k,arr));
    }
}
