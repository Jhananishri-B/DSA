class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]>max){
                max=costs[i];
            }
        }
        int[] count=new int[max+1];
        for(int i=0;i<costs.length;i++){
            count[costs[i]]++;
        }
        int total=0;
        for(int i=1;i<=max;i++){
            while(count[i]>0){
                if(coins<i){
                    return total;
                }
                coins=coins-i;
                total++;
                count[i]--;
            }
        }
        return total;
    }
}