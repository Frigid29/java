public class pattern2 {
    public static void main(String[] args) {
        System.out.println("inverted pattern");
        for(int i=4;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
