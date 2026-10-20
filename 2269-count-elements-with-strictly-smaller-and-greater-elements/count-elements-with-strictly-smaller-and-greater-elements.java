class Solution {
    public int countElements(int[] nums) {
    int n=nums.length;
    int count=0;
    List<Integer> list=new ArrayList<>();
    for(int i : nums){
        list.add(i);
    }    
    for(int i=0;i<n;i++){
        boolean small=false,large=false;
        for(int j=0;j<list.size();j++){
            if(list.get(j)<nums[i]){
                small=true;
            }
            else if(list.get(j)>nums[i]){
                large=true;
            }
        }
        if(small&&large){
            count+=1;
        }
    }
    return count;
    }
}