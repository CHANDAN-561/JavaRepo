package Arrays;

public class stocksBuySell {

    public static int maxProfit(int price[]) {
        int profit = 0, maxProfit = 0, buyingPrice = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (buyingPrice < price[i]) {
                profit = price[i] - buyingPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyingPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 6, 3, 4 };
        System.out.println("Your max profit can be: " + maxProfit(price));
    }
}
