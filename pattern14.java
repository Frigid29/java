public class pattern14 {
    public static void main(String[] args) {
        System.out.println("number pyramid: ");
        int line=5;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
