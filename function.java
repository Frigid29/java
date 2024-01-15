import java.util.*;
public class function {
    public static int funprint(int x, int y){
        
        int sum=x+y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number ");
        int a= sc.nextInt();
        System.out.print("Enter the number ");
        int b= sc.nextInt();
        int sum=funprint(a,b); //this is function call
        System.out.println("Sum : "+sum);
        sc.close();
    }
}
