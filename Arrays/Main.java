import java.util.*;
class Solution{
    public static int maxProfit(int k , int[] prices){
        int maxProfit = 0;

        //int maximumProfit = 0;

        for(int i =0;i<prices.length;i++){                      //buy
            for(int j = i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];            //check each day's SP to calculate and compare the max profit 
            
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
    }
        return maxProfit;
    }
   
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = {3,6,10,9,2};
        int k = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            prices[i] = sc.nextInt();
        }
        System.out.print(Solution.maxProfit(k,prices));
    }
}
