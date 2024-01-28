public class buySellStocks {


    public static int solution(int prices[]){
        
        int minPrice=prices[0];
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            int profit=prices[i]-minPrice;
            maxProfit=Math.max(maxProfit, profit);
        }

        return maxProfit;

    }
    

    public static void main(String[] args) {

        int prices[]={2, 100, 150, 120};
        System.out.println(solution(prices));
    }
}
