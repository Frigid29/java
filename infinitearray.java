public class infinitearray {
    public static void main(String[] args) {
        int[] ar={1,5,8,14,20,24,26,28,32,36,38,41,43,49,51,55,57,61,68,72,79,85,89,94,98};
        int target=98;
        int ans=search(ar, target);
        System.out.println(ans);
    }
    public static int search(int[] ar, int target){
        int start=0;
        int end=2;
        if(ar[start]== target){
            return start;
        }
        if(ar[end]== target){
            return end;
        }

        while(ar[end]<target){
            start=end;
            end=end*end;
            if(end>ar.length-1){
                end =ar.length-1;
            }
        }
        while(start<=end){
            int mid= start+ (end-start) /2;
            if(ar[mid]==target){
                return mid;
            }else if(ar[mid]> target){
                end=mid -1;
            }else{
                start= mid +1;
            }
        }
        return -1;
    }
}
