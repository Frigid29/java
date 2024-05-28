public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int n){
        //sqrt(N)=0.5*(X + (N/X));
        //error = |root-X|;
        double x=n;
        double root;
        while(true){
            root = 0.5*(x + (n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }

        return root;
    }
}
