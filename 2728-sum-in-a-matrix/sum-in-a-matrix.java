class Solution {
    public int matrixSum(int[][] nums) {
    int n=nums.length;
    int m=nums[0].length;
    for(int i=0;i<n;i++){
        Arrays.sort(nums[i]);
    }  
    int sum=0;
    for(int j=m-1;j>=0;j--){
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i][j]);
        }
        sum+=max;
    } 
    return sum;
    }
}