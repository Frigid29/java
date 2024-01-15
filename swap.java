import java.util.*;
public class swap {
    public static void swap(int a, int b){
        System.out.println("original values: \n\t a="+a+"\n\t b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped values: \n\t a="+a+"\n\t b="+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first value : ");
        int a=sc.nextInt();
        System.out.print("enter the second value : ");
        int b=sc.nextInt();
        swap(a,b);
        sc.close();
    }
}
