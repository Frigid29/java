import java.util.*;
public class strbuff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first word: ");
        StringBuffer sb=new StringBuffer("");
        String s=sc.next();
        sb=sb.append(s);
        System.out.println(s.equals(sb.reverse()));
        System.out.println(s);
    }
}
