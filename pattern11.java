import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line=sc.nextInt();
        System.out.println("Soilid Rhombous Pattern: ");
        int col=(line*2 );
        for(int i=1;i<=line;i++){
            for(int j=1;j<col;j++){
                char c= ((j>col-line-i) && (j<=col-i))?'*':' ';
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
/*
for(int k=line-i;k>0;k--){
    System.out.print(" ");
}
for(int j=1;j<=line;j++){
    System.out.print("*");
}*/