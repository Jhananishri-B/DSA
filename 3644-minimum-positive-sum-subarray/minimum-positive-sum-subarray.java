class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int min=Integer.MAX_VALUE;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums.get(i);
        }
        for(int i=0;i<n;i++){
            for(int j=i+l;j<=Math.min(n,i+r);j++){
                int sum=prefix[j]-prefix[i];
                if(sum>0){
                    min=Math.min(min,sum);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}