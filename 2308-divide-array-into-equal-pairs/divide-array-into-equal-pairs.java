class Solution {
    public boolean divideArray(int[] nums) {
    int count=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    int n=nums.length;
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }    
    for(int i:map.keySet()){
        if(map.get(i)%2!=0){
            return false;
        }
    }
    return true;
    }
}