// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {        
//         List<List<Integer>> ans=new ArrayList<>();
//         int sum=0;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(i>0 && nums[i]==nums[i-1]){
//                 continue;
//             }
//             for(int j=i+1;j<nums.length-1;j++){
//                 if(j>i+1 && nums[j]==nums[j-1]){
//                     continue;
//             }
//                 for(int k=j+1;k<nums.length;k++){
//                     if(k>j+1 && nums[k]==nums[k-1]){
//                         continue;
//             }
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         List<Integer> list=new ArrayList<>();
//                         list.add(nums[i]);
//                         list.add(nums[j]);
//                         list.add(nums[k]);
//                         ans.add(list);
//                     }
//                 }
//             }
//         }
//     return ans; 
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        Arrays.sort(nums);
        List<List<Integer>> temp = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            left=i+1;
            right=n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                List<Integer> list=new ArrayList<>();
                sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    temp.add(list);
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else{
                    if(sum<0){
                        left++;
                    }
                    else{
                        right--;
                    }
                }                
            }
        }
        return temp;
    }
}