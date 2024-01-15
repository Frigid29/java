import java.util.*;
public class binary_coefficient {
    public static int fact( int a){
        int f=1;
        while(a>0){
            f=f*a;
            a--;
        }
        return f;
    }
    public static double bin(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter r: ");
        int r=sc.nextInt();
        double bin_coff=fact(n)/(fact(r)*fact(n-r));
        sc.close();
        return bin_coff;
    }
    public static void main(String[] args) {
        
        System.out.println("binary Coefficient : "+bin());
        
    }
}
