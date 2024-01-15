import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum_even=0,sum_odd=0;
        int choice;
        do{
            //taking the number from the user
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            //checking if its odd or even and adding them
            if(num%2==0){
                sum_even+=num;
            }else{
                sum_odd+=num;
            }
            //asking the user if he want to continue or not
            System.out.println("Enter 1 if you want to continue inputting else enter 0 if you want to see the sum");
            choice=sc.nextInt();
        }while(choice==1);

        //print the even and odd numbers sum
        System.out.println("Sum of even numbers: "+ sum_even);
        System.out.println("Sum of odd numbers: "+ sum_odd);
        sc.close();
    }
}
