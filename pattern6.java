import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line=sc.nextInt();
        System.out.println("Inverted and rotated half pyramid");
        for(int i=1;i<=line;i++){
            //for spaces
            /*for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            //for pattern i.e *
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }*/
            for(int j=1;j<=line;j++){
                char c= (j>line-i)?'*':' ';
                System.out.print(c);
            }
            
            System.out.println();
        }
        sc.close();
    }
}
