import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line=sc.nextInt();
        System.out.println("Floyd's pattern");
        int term=1;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(term+" ");
                term++;
            }
            System.out.println();
        }
        sc.close();
    }
}
