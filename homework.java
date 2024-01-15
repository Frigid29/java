public class homework {
    public static void ques1(int matrix1[][], int num){
        int count=0;
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                if(num==matrix1[i][j]){
                    count++;
                }
            }
        }
        System.out.println("count of " + num + " is " + count);
    }

    public static void ques2(int matrix2[][]){
        int sum=0;
        for(int i=0;i<matrix2[1].length;i++){
            sum+=matrix2[1][i];
        }
        System.out.println("sum of second column: "+ sum);
    }

    public static void ques3(int matrix3[][]){
        for(int i=0; i<matrix3[0].length;i++){
            for(int j=0;j<matrix3.length;j++){
                System.out.print(matrix3[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix1[][]={{4,7,8},{8,8,7}};
        int num=7;
        int matrix2[][]={{1,4,9},{11,4,3},{2,2,3}};
        int matrix3[][]={{1,2,3},{4,5,6}};
        ques1(matrix1,num);
        ques2(matrix2);
        ques3(matrix3);
    }
}
