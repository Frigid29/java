//https://leetcode.com/problems/integer-to-english-words/description/

import java.util.*;
class Int2Str {
    public static String numberToWords(int num) {
        String[] pow={""," Thousand"," Million"," Billion"," Trillion"," Quadrillion"," Quintillion"," Sextillion"};
        String ans="";
        if(num==0){
            return "Zero";
        }
        for(int i=0;i>-1;i++){
            if(num==0){
                break;
            }
            int temp=num%1000;
            if(temp!=0)
                ans=digi(temp)+pow[i]+ans;
            num=num/1000;
        }
        return ans.trim();
    }

    public static String digi(int temporary){
        String[] dig={" One"," Two"," Three", " Four", " Five"," Six"," Seven", " Eight", " Nine"};
        String[] tens={" Ten"," Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen"," Eighteen"," Nineteen"};
        String[] round={" Twenty"," Thirty"," Forty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
        String ans="";
        int temp=temporary%1000;
        if(temp>99){
            int x=temp/100;
            ans+=dig[x-1]+" Hundred";
            temp=temp%100;
        }
        if(temp>19){
            int x=temp/10;
            ans+=round[x-2];
            temp=temp%10;
        }
        if(temp==0){
            return ans;
        }
        if(temp>9){
            int x=temp%10;
            ans+=tens[x];
            // temp=0;
        }else{
            int x=temp%10;
            ans+=dig[x-1];
            // temp=0;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(2000000));
    }
}