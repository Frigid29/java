import java.util.*;
import java.text.DecimalFormat;
public class RandomString {
    public static void main(String[] args) {
        int size=20;
        String randomString = generate(size);
        System.out.println(randomString);

        //remove all spaces 
        String sentence=" hi he l  l  o,  wo r l    d";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        //split
        String arr="Akash Kunal Ravi Adam";
        String[] split = arr.split(" ");
        System.out.println(Arrays.toString(split));

        String ar="Akash_Kunal_Ravi_Adam";
        String[] split2 = ar.split("_");
        System.out.println(Arrays.toString(split2));

        //decimal format
        DecimalFormat df= new DecimalFormat("00.000");
        System.out.println(df.format(123.89894));
    }
    public static String generate(int size){
        Random random=new Random();
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<size;i++){
            int randomchar=97+(int)(random.nextFloat()*26);
            ans.append((char)randomchar);
        }
        return ans.toString();    
    }
}
