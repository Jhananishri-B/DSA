class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    int n=nums.length;
    Arrays.sort(nums);
    int min=nums[0];
    int max=nums[n-1];
    int sum=0;
    int tot=0;
    List<Integer> list=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();    
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);               
    }
    for(int i=min;i<=max;i++){
        if(!set.contains(i)){
            list.add(i);
     }
    }   
    return list;
    }
}