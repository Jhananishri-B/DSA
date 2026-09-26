class Solution {
    public int alternatingSum(int[] nums) {
    int n=nums.length;
    int add=0;
    int sub=0;
    for(int i=0;i<n;i++){
        if(i%2==0){
            add+=nums[i];
        }
        else{
            sub+=nums[i];  
        }
    } 
    return add-sub;   
    }
}