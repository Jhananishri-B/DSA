class Solution {
    public int firstUniqueEven(int[] nums) {
    int n=nums.length;
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
       if(nums[i]%2==0){
        list.add(nums[i]);
       }
    }
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num : list){
       map.put(num,map.getOrDefault(num,0)+1);
    }
    for(int num:list){
        if(map.get(num)==1){
            return num;
        }
    }
    return -1;
    }
}