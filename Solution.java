import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int id[]=new int[n];
        String name[]= new String[n];
        float cgpa[]=new float[n];
        //taking input
        for(int i=0;i<n;i++){
            id[i]=sc.nextInt();
            name[i]=sc.next();
            cgpa[i]=sc.nextFloat();
        }
        //sorting
        if(n>=2 && n<=100){
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    int temp;
                    float tem;
                    String t;
                    
                    if(cgpa[i]<cgpa[j]){
                        tem= cgpa[i];
                        cgpa[i]=cgpa[j];
                        cgpa[j]=tem;
                        
                        temp=id[i];
                        id[i]=id[j];
                        id[j]=temp;
                        
                        t=name[i];
                        name[i]=name[j];
                        name[j]=t;
                    }
                    else if(cgpa[i]==cgpa[j])
                    {
                        if(!(name[i].equals(name[j])))
                        {
                            for(int k =0;k<name[i].length();k++)
                            {
                                if(name[i].charAt(k)>name[k].charAt(k))
                                {
                                    t=name[i];
                                    name[i]=name[j];
                                    name[j]=t;
                                    
                                    temp=id[i];
                                    id[i]=id[j];
                                    id[j]=temp;
                                    
                                    tem= cgpa[i];
                                    cgpa[i]=cgpa[j];
                                    cgpa[j]=tem;
                                    
                                    break;
                                }
                                
                            
                            else{
                                if(id[i]<id[j])
                                    {
                                        t=name[i];
                                        name[i]=name[j];
                                        name[j]=t;
                                        
                                        temp=id[i];
                                        id[i]=id[j];
                                        id[j]=temp;
                                        
                                        tem= cgpa[i];
                                        cgpa[i]=cgpa[j];
                                        cgpa[j]=tem;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        //print that is output
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }
}
