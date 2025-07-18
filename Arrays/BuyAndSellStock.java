public class BuyAndSellStock {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;           //we assume minPrice as the MAX_VALUE ,so when we compare ,then we can update minValue and eventually get the least value to buy the stock
        int maxProfit =0;                           //initially the Profit is 0 ,as we haven't bought or sell anything yet ,we want maxProfit , so it also gets updated after each iteration


        for(int i =0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice =prices[i];                                    //update to new minimum
            }else if(prices[i] - minPrice > maxProfit){                 //if today's price is not less than minPrice , it means it is greater , then checking for profit 
                maxProfit = prices[i] - minPrice;                       //calculates profit 
            }
        }
        return maxProfit;
    }
    
public static void main(String[] args){
    int[] prices ={7,1,10,5,2};
    int result = maxProfit(prices);
    System.out.println("Max profit is : " + result);
}
}


