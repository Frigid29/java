import java.util.*;

public class GridPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        int[][] grid=new int[n][2];
        for(int i=0; i<n;i++){
            for(int j=0; j<2; j++){
                System.out.print("Enter the value of ("+i+" , "+j+")th term: ");
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println("Total sum: "+ ans(grid,0));
    }
    public static int ans(int[][] grid,int i){
        if(i==grid.length-1){
            return grid[i][0]>grid[i][1]?grid[i][0]:grid[i][1];
        }
        int temp=ans(grid,i+1);
        int left=grid[i][0];
        int right=grid[i][1];
        if(grid[i][0]<temp){
            left=grid[i][0]+temp;
        }
        if(grid[i][1]<temp){
            right=grid[i][1]+temp;
        }
        return left>right?left:right;
    }
}
