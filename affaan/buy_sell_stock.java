public class buySellStock {
    public static int buySellStock(int[] stockPrices) {
        int profit = 0;
        int buyInPrice = Integer.MAX_VALUE;
        for(int i=0; i<stockPrices.length; i++) {
            if (stockPrices[i] < buyInPrice) {
                buyInPrice = stockPrices[i];
            }
            else if (stockPrices[i] - buyInPrice > profit){
                profit = stockPrices[i] - buyInPrice;
            }
        }
        return profit;
    }
    public static void main(String args[]) {
        int[] testArray = {8, 3, 9, 2, 4, 10, 12, 7};
        System.out.println(buySellStock(testArray));

    }
}
