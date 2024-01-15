import java.util.*;
public class strhomework {

    public static void countLower(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' |ch=='u'){
                count++;
            }
        }
        System.out.println("Count of lowercase vowels: "+ count);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        countLower(s);
    }
}
