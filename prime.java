import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        boolean isprime= true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isprime= false;
            }
        }
        if(num==2){
            isprime= true;
        }
        System.out.println("prime number: "+isprime);
        sc.close();
    }
}
