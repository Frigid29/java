import java.util.*;
class Radix{
    public static void radixSort(int[] ar){
        int max=ar[0];
        for(int i= 0; i<ar.length; i++){
            if(ar[i] > max){
                max=ar[i];
            }
        }
        
        for(int exp = 1; max/exp > 0; exp*=10){
            countSort(ar, exp);
        }
    }

    public static void countSort(int[] ar, int exp){
        int n = ar.length;
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for(int i=0; i<n ; i++){
            count[(ar[i] / exp) % 10]++;
        }
        System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

        for(int i=1; i<10; i++){
            count[i]= count[i] + count[i-1];
        }
        System.out.println("\nCount array after counting " + exp + " : " + Arrays.toString(count));

        for(int i=n-1; i>=0; i--){
            output[count[(ar[i] / exp) % 10] - 1] = ar[i];
            count[(ar[i] / exp) % 10]--; 
        }
        System.out.println("\nOutput array after counting " + exp + " : " + Arrays.toString(output));

        System.arraycopy(output,0,ar,0,n);
    }

    public static void main(String[] args) {
        int[] ar ={29, 83, 471, 36, 91, 8};
        radixSort(ar);
        System.out.println("\nSorted array is " + Arrays.toString(ar));
    }

}
