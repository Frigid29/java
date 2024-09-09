import java.util.*;
public class countsort {
    //basic way
    public static void countSort(int[] arr){
        //step 1 --> find the largest element
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        //step 2--> create an array of length max+1
        int[] count=new int[max+1];

        //step 3--> count the frequency of each element
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //step 4--> sort the array
        int j=0;
        for(int i=1;i<count.length;i++){
            if(count[i]!=0){
                while(count[i]>0){
                    arr[j++]=i;
                    count[i]--;
                }
            }
        }
    }

    //using hashmap
    public static void countSort2(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int j=0;
        for(int i=0;i<=max; i++){
            if(map.containsKey(i)){
                while (map.get(i)>0) {
                    arr[j++]=i;
                    map.put(i,map.get(i)-1);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={3,4,1,3,2,5,2,8};
        countSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
