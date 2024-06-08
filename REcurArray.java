import java.util.*;
public class REcurArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] ar){
        ar[0] = 10;
    }
}
