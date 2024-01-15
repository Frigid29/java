import java.util.*;
public class multipleoften {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("break on multiple of ten");
        while(true){
            System.out.print("enter a number: ");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
        System.out.println("continue on muliple of ten");
        while(true){
            System.out.print("enter a number: ");
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
            sc.close();
        }
    }
}
