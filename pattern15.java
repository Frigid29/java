public class pattern15 {
    public static void main(String[] args) {
        System.out.println("palindromic pattern with number: ");
        int line=5;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
