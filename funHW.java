import java.util.*;
import java.math.*;

public class funHW {
    public static void average(int num1, int num2, int num3){
        float avg=(num1 + num2 + num3)/3.0f;
        System.out.println("Average = "+ avg);
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static void palindrome(int number){
        int rev=0;
        int num=number;
        while(num>0){
            rev=(rev*10) + (num%10);
            num=num/10;
        }
        if(number==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static void usemath(int a, int b){
        System.out.println("Min: "+ Math.min(a,b));
        System.out.println("Max: "+ Math.max(a,b));
        System.out.println("Square root: "+ Math.sqrt(a) +"\t"+ Math.sqrt(b));
        System.out.println("power: "+ Math.pow(a,b));
        System.out.println("Absolute value: "+ Math.abs(b-a));
    }

    public static void sumDigit(int num){
        int sum=0;
        while(num>0){
            sum= sum + (num%10);
            num= num/10;
        }
        System.out.println("Sum of Digit= "+ sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your choice: \n1) Average of 3 numbers \n2) Even \n3) Palindrome \n4) USe of Math Class functon \n5) Sum of digit of a number");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("enter the number: ");
                int a=sc.nextInt();
                System.out.print("enter the number: ");
                int b=sc.nextInt();
                System.out.print("enter the number: ");
                int c=sc.nextInt();
                average(a,b,c);
                break;
            case 2:
                System.out.print("Enter the number: ");
                int n=sc.nextInt();
                System.out.println(isEven(n));
                break;
            case 3:
                System.out.print("Enter the number: ");
                int palin=sc.nextInt();
                palindrome(palin);
                break;
            case 4:
                System.out.print("Enter the number: ");
                int num1= sc.nextInt();
                System.out.print("enter the number: ");
                int num2= sc.nextInt();
                usemath(num1, num2);
                break;
            case 5:
                System.out.print("Enter the number: ");
                int number= sc.nextInt();
                sumDigit(number);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
