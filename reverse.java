import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int reverse=0;
        //using for
        for (int i=num;i>0;i/=10){
            reverse=reverse*10 + (i%10);
        }
        System.out.println("Reverse: "+ reverse);
        //using while
        int rev=0;
        while(num>0){
            rev=rev*10 + (num%10);
            num/=10;
        }
        System.out.println("reverse: "+rev);
        sc.close();
    }
}
