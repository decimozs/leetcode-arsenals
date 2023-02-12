class Solution {
    public int maxProfit(int[] prices) {
        // declare a min max value 
        int minVal = Integer.MAX_VALUE;
        int maxVal = 0;

        // loop trough the array of prices or the day
        for (int i = 0; i < prices.length; i++) {
            // check if the iterating index of prices is less than to the min value
            if (prices[i] < minVal) {
                // then set the min val to the prices we have on current
                minVal = prices[i];
            // hence check if its profitable
            } else if (prices[i] - minVal > maxVal) {
                // then max profit value will be equal to the iterating index of prices minus the current minimum value 
                maxVal = prices[i] - minVal;
            }
        }
        return maxVal;
    }
}