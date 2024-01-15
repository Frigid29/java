public class pattern9 {
    public static void main(String[] args) {
        System.out.println("Triangle Pattern: ");
        int line=5;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                int c=(i+j)%2==0 ? 1:0;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
