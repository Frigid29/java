//link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

import java.util.*;

public class Stocks121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int buy=prices[0];
        int sell=prices[1];
        int profit = 0;
        for(int i=0; i< prices.length-1; i++){
            if(buy> prices[i]){
                buy=prices[i];
            }
            sell=prices[i+1];
            profit = profit<(sell-buy) ? (sell-buy): profit;
        }
        return profit;
    }
    public static void main(String[] args) {
        Stocks121 s = new Stocks121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}
