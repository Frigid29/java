public class staircase {


    public static void staircase(int matrix[][], int key){
        int row=0;int col=matrix[0].length-1;
        int c=0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found at: (" + row + "," + col + ")");
                c++;
                break;
            }
            else if(key>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        if(c==0){
            System.out.println("Not found");
        }
    }


    public static void count(int matrix[][],int term){
        int row=0;
        int col=matrix[0].length-1;
        int c=0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==term){
                c++;
            }
            else if(term>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,20,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        
        int key=33;
        staircase(matrix, key);
    }
}
