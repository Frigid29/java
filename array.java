import java.util.*;
public class array {


    public static int StrCheck(String s[],String k){
        for(int i=0; i<s.length;i++){
            if(s[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static int largest(int numbers[]){
        int large= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
        }
        return large;
    }

    

    public static void main(String[] args) {
        /*String s[]={"Akash","Singh","rautela","Hero","Pagal"};
        String key="Hero";
        int index=StrCheck(s,key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("index= "+index);
        }*/

        int numbers[]={1,2,5,10,4,7,8,9,5,4,6,};
        System.out.println("largest : "+ (largest(numbers)));
    }
}
