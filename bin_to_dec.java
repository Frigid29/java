import java.math.*;
import java.util.*;
public class bin_to_dec {
    public static int conversion(int num){
        int c=0;
        int dec=0;
        for(int i=num;i>0;i=i/10){
            dec=dec+(num%10)*(int)(Math.pow(2,c));
            c++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int bin=sc.nextInt();
        int dec=conversion(bin);
        System.out.println(dec);
    }
}
