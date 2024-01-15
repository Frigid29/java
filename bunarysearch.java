public class bunarysearch {
    public static int binary(int Num[], int key){
        int start=0, last=Num.length-1;
        int mid;
        while(start<=last){
            mid=(start+last)/2;
            if(Num[mid]==key){
                return mid;
            }else if(key>Num[mid]){
                start=mid+1;
            }else{
                last=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int Num[]={2,4,6,8,10,12,14,16,18};
        int key=16;
        if(binary(Num,key)==-1){
            System.out.println("Not found");
        }else{
            System.out.println(binary(Num,key));
        }
       
    }
}
