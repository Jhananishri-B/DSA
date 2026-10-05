class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int sum=0;
    int avaeage=0;
    int left=0;
    int n=nums.length;
    for(int i=0;i<k;i++){
       sum+=nums[i];
    }   
    int max=sum;
    for(int i=k;i<n;i++){  
        sum=sum-nums[left]+nums[i];  
        left++;      
        if(sum>max){
            max=sum;
        }
    } 
    return (double) max/k;
    }
}