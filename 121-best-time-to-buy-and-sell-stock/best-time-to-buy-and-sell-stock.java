class Solution {
    public int maxProfit(int[] prices) {
    int n=prices.length;
    int min=prices[0];
    int max=0;
    for(int i=0;i<n;i++){
        int sp=prices[i];
        int profit=sp-min;
        if(profit>max){
            max=profit;
        }
        if(prices[i]<min){
            min=prices[i];
        }
    }  
    return max;  
    }
}