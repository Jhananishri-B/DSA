class Solution {
    public int maxFrequency(int[] nums, int k) {
    int n=nums.length;
    int max=0;
    int left=0;
    long sum=0;
    Arrays.sort(nums);
    for(int right=0;right<nums.length;right++){
        sum+=nums[right];
        while((long)nums[right]*(right-left+1)-sum>k){
            sum=sum-nums[left];
            left++;
        }
        max=Math.max(max,right-left+1);
    }
    return max;
    }
}