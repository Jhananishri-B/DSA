class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i : nums){
            sum+=i;
        }
        int ls=0,rs=0;
        for(int i=0;i<n;i++){
            rs=sum-ls-nums[i];
            if(rs==ls){
                return i;
            }
            ls+=nums[i];
        }
        return -1;        
    }
}