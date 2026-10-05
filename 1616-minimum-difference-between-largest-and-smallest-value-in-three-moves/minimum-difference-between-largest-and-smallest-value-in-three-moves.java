class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n <= 4){
            return 0;
        }
        return Math.min(
            Math.min(nums[n-4]-nums[0],nums[n-3]-nums[1]),
            Math.min(nums[n-2]-nums[2],nums[n-1]-nums[3])
        );
    }
}