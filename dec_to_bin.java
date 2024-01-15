import java.util.Scanner;
import java.math.*;
public class dec_to_bin {
    public static int mybin(int num){
        int bin=0;
        int count=0;//for power
        for(int i=num;i>0;i=i/2){
            bin=bin+((i%2)*(int)(Math.pow(10,count)));
            c++;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int dec=sc.nextInt();
        int bin=mybin(dec);
        System.out.println(bin);
    }
}
