class Solution {
    public int findUnsortedSubarray(int[] nums) {
    int[] arr=new int[nums.length];
    int k=0;
    int count=0;
    for(int n:nums){
        arr[k++]=n;
    }   
    Arrays.sort(arr);
    int left=0;
    int right=nums.length-1;
    while(left<nums.length && nums[left]==arr[left]){
        left++;
    }
    while(right>=0 && nums[right]==arr[right]){
        right--;
    }
    if(left>=right){
        return 0;
    }
    return right-left+1;
    }
}