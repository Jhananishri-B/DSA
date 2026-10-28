class Solution {
    public int[] sortedSquares(int[] nums) {
    int k=0;
    int[] arr=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        arr[k++]=nums[i]*nums[i];
    }    
    Arrays.sort(arr);
    return arr;
    }
}