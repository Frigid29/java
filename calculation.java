import java.util.*;
public class calculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter an integer value");
        int a= sc.nextInt();
        System.out.println("enter an integer value");
        int b= sc.nextInt();
        int sum=a+b;
        int diff=a-b;
        int pro=a*b;
        int rem=a%b;
        int div=a/b;
        double div1=a/b;
        System.out.println("sum = "+sum);
        System.out.println("diff = "+diff);
        System.out.println("product = "+pro);
        System.out.println("remainder = "+rem);
        System.out.println("divident = "+div);
        System.out.println("divident with decimal = "+div1);

        System.out.println("enter the radius to calculate thr area of circle");
        double rad=sc.nextDouble();
        double area= 3.14*rad*rad;
        System.out.println("Area = "+area);
        sc.close();
    }
}
