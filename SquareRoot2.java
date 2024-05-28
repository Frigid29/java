public class SquareRoot2 {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int n){
        int s=0, e=n;
        double root;
        int mid;

        while(s<=e){
            mid=s+ (e-s)/2;
            if(mid*mid==n){
                root=mid;
                return mid;
            }
            else if(mid*mid>n){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        root=e;
        int precision=3;
        double inc=0.1;
        for(int i=1;i<=precision;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc=inc*0.1;
        }
        return root;
    }
}
