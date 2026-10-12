class Solution {
    public int findGCD(int[] nums) {
    Arrays.sort(nums);
    int max=nums[nums.length-1];    
    int min=nums[0];
    while(max%min!=0){
        int rem=max%min;
        max=min;
        min=rem;
    }
    return min;
    }
}