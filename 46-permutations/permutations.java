class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> temp=new ArrayList<>();
            for(List<Integer> list:result){
                for(int i=0;i<=list.size();i++){
                    List<Integer> arr=new ArrayList<>(list);
                    arr.add(i,num);
                    temp.add(arr);
                }
            }
            result=temp;
        }
        return result;
    }
}