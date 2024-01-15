import java.util.*;
import java.math.*;
public class funprime {
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end=sc.nextInt();
        for(int num=start;num<=end;num++){
            if(isPrime(num)){
                System.out.print(num+" ");
            }
        }
        
    }
}
