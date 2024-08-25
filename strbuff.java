import java.util.*;
public class strbuff {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sbuff= new StringBuffer();
        //constructor 2
        StringBuffer sbuff2= new StringBuffer("Hello! World");
        //constructor 3
        StringBuffer sbuff3= new StringBuffer(30);
        System.out.println(sbuff.capacity());

        sbuff.append("WeMakeDevs");
        System.out.println(sbuff);
        sbuff.insert(2," akash here");
        System.out.println(sbuff);

        sbuff.replace(2,5,"yohohoh");
        System.out.println(sbuff);

        sbuff.delete(2,4);
        System.out.println(sbuff);

        sbuff.reverse();
        System.out.println(sbuff);

    }
}
