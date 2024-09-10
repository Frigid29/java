//https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true

import java.math.BigDecimal;
import java.util.*;
class bigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of terms: ");
        int n=sc.nextInt();
        System.out.println();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            System.out.print("enter the "+i+" term: ");
            s[i]=sc.next();
        }
        System.out.println();
      	sc.close();
          String s2[]=new String[n];
          int c=0;
          for(int i=0; i<n+2; i++){
              if(s[i]!=null){
                  s2[i-c]=s[i];
              }else{
                  c++;
              }
          }
          
        for( int i=0; i<s2.length-1; i++){
            
            for(int j=i+1; j<s2.length; j++){
                BigDecimal a= new BigDecimal(s2[i]);
                BigDecimal b= new BigDecimal(s2[j]);
                if(a.equals(b)){
                    if(s2[i].length()<s2[j].length()){
                        String t=s2[i];
                        s2[i]=s2[j];
                        s2[j]=t;
                    }
                }
                else if(a.max(b).equals(b)){
                    String t=s2[i];
                    s2[i]=s2[j];
                    s2[j]=t;
                }
            }
        }
        
        s=s2;

        //Output
        System.out.println("output: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}