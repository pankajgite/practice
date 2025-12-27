public class buySellStocks {
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=prices[0];
        int max=0;
        for(int i =0;i<prices.length;i++){
            if(buy>prices[i]){
                max=Math.max(max, sell-buy);
                buy=prices[i];
                sell=prices[i];
            }else{
                if(sell<prices[i]){
                    sell=prices[i];
                }
            }
            

        }

        return Math.max(max,sell-buy);
    }
    public static void main(String[] args) {
        int[] price = {2,4,1};
        System.out.println(maxProfit(price));
    }
}
