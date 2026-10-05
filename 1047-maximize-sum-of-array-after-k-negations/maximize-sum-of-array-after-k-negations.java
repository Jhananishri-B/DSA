class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
    while(k-- >0){
        int min=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;
            }            
        }
        nums[min]=-nums[min];
    }
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
    return sum;
    }
}