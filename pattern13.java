import java.util.*;
public class pattern13
{
    public static void diamond(int line){
        //first half
        for(int i=1;i<=line;i++){
            //spaces
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }

        //second half
        for(int i=line;i>0;i--){
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Diamond Pattern");
        System.out.println("Enter the no. of lines");
        int l=sc.nextInt();
        diamond(l);
    }
}