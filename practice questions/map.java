import java.math.*;
import java.util.*;
public class map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map= new HashMap<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            String s= sc.nextLine();
            sc.nextLine();
            int m= sc.nextInt();
            int h= s.hashCode();
            map.put(h,m);
        }
        for(int i=0;i<n; i++){
            String q=sc.nextLine();
            System.out.println(q);
            // int h= q.hashCode() % 101;
            // if(map.containsKey(h)){
            //     System.out.println(q+"="+map.get(h));
            // }else{
            //     System.out.println("Not found");
            }
        }
    }
}
