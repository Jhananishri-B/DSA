class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if (n<=4){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<4;i++){
            int diff=nums[n-4+i]-nums[i];
            if (diff<min) {
                min=diff;
            }
        }
        return min;
    }
}