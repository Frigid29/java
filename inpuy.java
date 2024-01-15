import java.util.*;
public class inpuy{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter boolean value: ");
        boolean bool=sc.nextBoolean();
        System.out.println("boolean= "+bool);
        System.out.println("enter short type value: ");
        short srt=sc.nextShort();
        System.out.println("short= "+srt);
        System.out.println("enter decimal value: ");
        double dub=sc.nextDouble();
        System.out.println("double="+dub);
        sc.close();
        
    }
}
