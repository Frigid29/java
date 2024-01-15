import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line=sc.nextInt();
        int col=line*2;
        System.out.println("Hollow rombous: ");
        for(int i=0;i<line;i++){
            for(int j=1;j<col;j++){
                //we have to check 4 coditions that is for left , right, up and bottom
                //char c=((j==line-i+1)||(j==line-i+5)||(i==1 && j>line-i+1)||(i==line && j<line-i+5))?'*':' ';
                char c=((j==col-line-i)||(j==col-line-i+4)||(i==line-1 && j<=line)||(i==0 && j>col-line))?'*':' ';
                System.out.print(c+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
 