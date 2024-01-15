import java.util.*;
public class variable 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        //question 1
        System.out.println("question 1: average of 3 numbers");
        System.out.print("Enter the number a :");
        int a=sc.nextInt();
        System.out.print("Enter the number b :");
        int b=sc.nextInt();
        System.out.print("Enter the number c :");
        int c=sc.nextInt();
        float avg=(a+b+c)/(3.0f);
        System.out.println("Average = "+avg);

        //question 2
        System.out.println();
        System.out.println("Question 2: area of a square");
        System.out.print("Enter the side :");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("area of square: "+area);

        //question 3
        System.out.println();
        System.out.println("Question 3: bill of three items");
        System.out.print("enter the price of item 1: ");
        float item1=sc.nextFloat();
        System.out.print("enter the price of item 2: ");
        float item2=sc.nextFloat();
        System.out.print("enter the price of item 3: ");
        float item3=sc.nextFloat();
        float total=item1+item2+item3;
        float bill=1.18f * total;
        System.out.println("total = "+total);
        System.out.println("Bill= "+bill);
        sc.close();

        
    }    
}
