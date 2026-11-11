class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long a=(long)need1*cost1+(long)need2*cost2;
        long b=(long)Math.min(need1,need2)*costBoth;
        int remaining=Math.abs(need1-need2);
        if(need1>need2){
            b+=(long)remaining * Math.min(cost1,costBoth);
        }
        else{
            b+=(long)remaining* Math.min(cost2,costBoth);
        }
        return Math.min(a,b);
    }
}