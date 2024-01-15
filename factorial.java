import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking the number from user
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int fact=1; //to store the factorial
        //calculating the factorial
        while(num>0){
            fact*=num;
            num--;
        }
        //printing the factorial
        System.out.println("Factorial = "+ fact);
        sc.close();
    }
}
