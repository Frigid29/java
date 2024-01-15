import java.util.*;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line=sc.nextInt();
        if(line<6){
            line=line+line;
            System.out.println("Since the no. of lines are not enough to make a butterfly pattern, the no. of lines are double.");
        }
        System.out.println("Butterfly pattern: ");
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line;j++){
                if(i<=line/2){
                    char c= ((j<=i)||(j>=line-i)) ? '*':' ';
                    System.out.print(c+" ");
                }else{
                    char c=((j<=line+1-i)||(j>=i))? '*':' ';
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
