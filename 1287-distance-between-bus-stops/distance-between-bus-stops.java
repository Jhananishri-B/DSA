class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int tot=0;
        int sum=0;
        for(int d:distance){
            tot+=d;
        }
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        for(int i=start;i<destination;i++){
            sum+=distance[i];
        }
        return Math.min(sum,tot-sum);
    }
}