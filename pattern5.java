import java.util.Scanner;

public class pattern5 {

    public static void hollow(int row, int column){
        int line=row,col=column;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=col;j++){
                if(j==1 || j==col|| i==1 || i==line){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hollow rectangle: \n");
        System.out.println("enter the lines");
        int row= sc.nextInt();
        System.out.println("enter the columns");
        int column= sc.nextInt();
        hollow(row , column);
        sc.close();
    }
}
