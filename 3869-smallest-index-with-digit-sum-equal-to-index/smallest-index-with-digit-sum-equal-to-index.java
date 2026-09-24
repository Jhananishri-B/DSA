class Solution {
    public int smallestIndex(int[] nums) {
    int n=nums.length;
    for(int i=0;i<n;i++){
        if(i==nums[i] && (nums[i]>=0 && nums[i]<=9)){
            return i;
        }
        else if(nums[i]>=10){
            int temp=nums[i];
            int sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum==i){
                return i;
            }
        }
    } 
    return -1;   
    }
}